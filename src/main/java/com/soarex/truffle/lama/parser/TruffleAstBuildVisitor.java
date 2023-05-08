package com.soarex.truffle.lama.parser;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.strings.TruffleString;
import com.soarex.truffle.lama.LamaException;
import com.soarex.truffle.lama.LamaLanguage;
import com.soarex.truffle.lama.Utils;
import com.soarex.truffle.lama.nodes.*;
import com.soarex.truffle.lama.nodes.expr.arithmetics.*;
import com.soarex.truffle.lama.nodes.expr.cmp.LamaCmpNode;
import com.soarex.truffle.lama.nodes.expr.cmp.LamaCmpNodeGen;
import com.soarex.truffle.lama.nodes.expr.control.*;
import com.soarex.truffle.lama.nodes.functions.FunctionCallNode;
import com.soarex.truffle.lama.nodes.functions.FunctionDeclarationNode;
import com.soarex.truffle.lama.nodes.functions.builtins.AbsFunctionNode;
import com.soarex.truffle.lama.nodes.variables.*;
import com.soarex.truffle.lama.parser.LamaLexer;
import com.soarex.truffle.lama.parser.LamaParser;
import com.soarex.truffle.lama.parser.LamaParserBaseVisitor;
import com.soarex.truffle.lama.runtime.GlobalScope;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import static com.soarex.truffle.lama.Utils.*;

import java.util.*;
import java.util.stream.Collectors;

/* package private */ final class TruffleAstBuildVisitor extends LamaParserBaseVisitor<LamaNode> {
    final ParserState state = new ParserState();
    final LamaLanguage lamaLanguage;
    private final Map<TruffleString, LamaNode> builtins = new HashMap<>();

    TruffleAstBuildVisitor(LamaLanguage lamaLanguage) {
        this.lamaLanguage = lamaLanguage;
        builtins.put(AbsFunctionNode.name, AbsFunctionNode.create(lamaLanguage));
    }

    @Override
    public LamaNode visitProgram(LamaParser.ProgramContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public LamaNode visitScopeExpression(LamaParser.ScopeExpressionContext ctx) {
        return visitScopeExpression(ctx, true);
    }

    private LamaNode visitScopeExpression(LamaParser.ScopeExpressionContext ctx, boolean leaveScope) {
        state.enterScope();

        List<LamaNode> defs = expandScopeDefinitions(ctx);
        var scopeExpr = ctx.expr == null ? null : visit(ctx.expr);

        LamaNode ret;
        if (ctx.defs.size() > 0) {
            if (scopeExpr != null) {
                defs.add(scopeExpr);
            }
            ret = new LamaExpressionListNode(defs);
        } else {
            ret = scopeExpr;
        }

        if (leaveScope) {
            state.leaveScope();
        }
        return ret;
    }

    @Override
    public LamaNode visitExpression(LamaParser.ExpressionContext ctx) {
        return new LamaExpressionListNode(ctx.basicExpression().stream().map(this::visit).toList());
    }

    @Override
    public LamaNode visitScope(LamaParser.ScopeContext ctx) {
        return visit(ctx.scopeExpression());
    }

    private List<LamaNode> expandScopeDefinitions(LamaParser.ScopeExpressionContext ctx) {
        if (ctx.defs.size() == 0) {
            return Collections.emptyList();
        }

        var defsCollector = new DefinitionCollector();
        defsCollector.visitScopeExpression(ctx);

        var expressions = new ArrayList<LamaNode>();

        // definitions
        defsCollector
                .getDefinitions()
                .stream()
                .map(this::visit)
                .collect(Collectors.toCollection(() -> expressions));

        // assignments
        defsCollector.getVariableAssignments().forEach(assn -> {
            var variable = state.lookup(asTruffleString(assn.name()));
            if (variable instanceof FrameMember.LocalVariable local) {
                expressions.add(WriteLocalVarNodeGen.create(visit(assn.value()), local.index()));
            } else if (variable instanceof FrameMember.GlobalVariable global) {
                expressions.add(WriteGlobalVarNodeGen.create(visit(assn.value()), global.name()));
            } else {
                throw new IllegalStateException("Unexpected variable kind");
            }
        });

        return expressions;
    }

    @Override
    public LamaNode visitVariableDefinitionItem(LamaParser.VariableDefinitionItemContext ctx) {
        var variable = state.declareVariable(asTruffleString(ctx.name.getText()));
        if (variable instanceof FrameMember.LocalVariable local) {
            return new LocalVarDeclarationNode(local.index());
        } else if (variable instanceof FrameMember.GlobalVariable global) {
            return new GlobalVarDeclarationNode(global.name());
        } else {
            throw new IllegalStateException("Unexpected variable kind");
        }
    }

    @Override
    public LamaNode visitFunctionDefinition(LamaParser.FunctionDefinitionContext ctx) {
        var name = asTruffleString(ctx.name.getText());
        var mangledName = ((FrameMember.GlobalVariable) state.declareVariable(name)).name();
        state.enterFunction();

        var args = ctx.params.params
                .stream()
                .map(Token::getText)
                .map(Utils::asTruffleString)
                .toList();
        state.declareFunctionParams(args);
        var body = visitScopeExpression(ctx.body.scopeExpression());

        FrameDescriptor frame = state.leaveFunction();
        return new FunctionDeclarationNode(mangledName, frame, body);
    }

    @Override
    public LamaNode visitBinaryExpression(LamaParser.BinaryExpressionContext ctx) {
        var lhs = visit(ctx.lhs);
        var rhs = visit(ctx.rhs);

        return switch (ctx.operator.getType()) {
            case LamaLexer.PLUS -> LamaAddNodeGen.create(lhs, rhs);
            case LamaLexer.MINUS -> LamaSubNodeGen.create(lhs, rhs);
            case LamaLexer.MUL -> LamaMulNodeGen.create(lhs, rhs);
            case LamaLexer.DIV -> LamaDivNodeGen.create(lhs, rhs);
            case LamaLexer.MOD -> LamaModNodeGen.create(lhs, rhs);
            case LamaLexer.OP_OR -> LamaOrNodeGen.create(lhs, rhs);
            case LamaLexer.OP_AND -> LamaAndNodeGen.create(lhs, rhs);
            case LamaLexer.ASSIGN -> createAssignment(lhs, rhs);
            default -> throw new IllegalStateException("Unexpected value: " + ctx.operator);
        };
    }

    // TODO: generic case when lhs - any LamaNode (array, s-exp, etc)
    private LamaNode createAssignment(LamaNode ref, LamaNode value) {
        if (ref instanceof ReadLocalVarNode readLocal) {
            return WriteLocalVarNodeGen.create(value, readLocal.getSlot());
        } else if (ref instanceof ReadArgumentNode readArg) {
            return new WriteArgumentNode(readArg.getIndex(), value);
        } else if (ref instanceof ReadGlobalVarNode readGlobal) {
            return WriteGlobalVarNodeGen.create(value, readGlobal.getName());
        }
        throw new IllegalStateException("Unexpected value: " + ref);
    }

    @Override
    public LamaNode visitUnaryExpression(LamaParser.UnaryExpressionContext ctx) {
        var inner = visit(ctx.expr);

        return switch (ctx.operator.getType()) {
            case LamaLexer.OP_NOT -> LamaNotNodeGen.create(inner);
            case LamaLexer.PLUS -> LamaUnaryPlusNodeGen.create(inner);
            case LamaLexer.MINUS -> LamaUnaryMinusNodeGen.create(inner);
            default -> throw new IllegalStateException("Unexpected value: " + ctx.operator);
        };
    }

    @Override
    public LamaNode visitCallExpression(LamaParser.CallExpressionContext ctx) {
        var func = visit(ctx.base);
        var args = ctx.args.stream().map(this::visit).toArray(LamaNode[]::new);
        return new FunctionCallNode(func, args);
    }

    @Override
    public LamaNode visitSkip(LamaParser.SkipContext ctx) {
        return new LamaSkipNode();
    }

    @Override
    public LamaNode visitIdentifier(LamaParser.IdentifierContext ctx) {
        var name = asTruffleString(ctx.L_IDENT().getText());

        var lookupResult = state.lookup(name);
        if (lookupResult instanceof FrameMember.LocalVariable v) {
            return ReadLocalVarNodeGen.create(v.index());
        }
        if (lookupResult instanceof FrameMember.FunctionParameter p) {
            return new ReadArgumentNode(p.index());
        }
        if (lookupResult instanceof FrameMember.GlobalVariable v) {
            return new ReadGlobalVarNode(v.name());
        }

        var func = builtins.get(name);
        if (func != null) return func;

        throw new IllegalStateException("Unexpected value: " + lookupResult);
    }

    // String literal
    @Override
    public LamaNode visitStringLiteral(LamaParser.StringLiteralContext ctx) {
        var text = removeQuotes(ctx.STRING_LITERAL().getText());
        return new LamaStringLiteralNode(asTruffleString(text));
    }

    private String removeQuotes(String text) {
        return text.substring(1, text.length() - 1);
    }

    // Number literals
    @Override
    public LamaNode visitNumberLiteralExpression(LamaParser.NumberLiteralExpressionContext ctx) {
        var num = Integer.parseInt(ctx.num.getText());
        return new LamaNumberLiteralNode(num);
    }

    // Character literals
    // In Lama char literals are simply desugared into character code
    @Override
    public LamaNode visitCharacterLiteral(LamaParser.CharacterLiteralContext ctx) {
        String text = ctx.CHARACTER_LITERAL().getText();
        String rawSymbol = text.substring(1, text.length() - 1);
        char symbol = switch (rawSymbol) {
            case "\\'" -> '\'';
            case "\\t" -> '\t';
            case "\\n" -> '\n';
            default -> rawSymbol.charAt(0);
        };
        return new LamaNumberLiteralNode(symbol);
    }

    @Override
    public LamaNode visitComparisonExpression(LamaParser.ComparisonExpressionContext ctx) {
        var lhs = visit(ctx.lhs);
        var rhs = visit(ctx.rhs);
        return LamaCmpNodeGen.create(lhs, rhs, LamaCmpNode.Op.fromRepr(ctx.operator.getText()));
    }

    @Override
    public LamaNode visitIfThenElse(LamaParser.IfThenElseContext ctx) {
        var cond = visitExpression(ctx.cond);
        var then = visitScopeExpression(ctx.then);
        var elss = ctx.elsePart() == null ? null : visit(ctx.elsePart());
        return new LamaIfNode(cond, then, elss);
    }

    @Override
    public LamaNode visitElseIf(LamaParser.ElseIfContext ctx) {
        var cond = visitExpression(ctx.cond);
        var then = visitScopeExpression(ctx.then);
        var elss = ctx.elsePart() == null ? null : visit(ctx.elsePart());
        return new LamaIfNode(cond, then, elss);
    }

    @Override
    public LamaNode visitElse(LamaParser.ElseContext ctx) {
        return visitScopeExpression(ctx.scopeExpression());
    }

    @Override
    public LamaNode visitWhileLoop(LamaParser.WhileLoopContext ctx) {
        var cond = visitExpression(ctx.expression());
        var body = visitScopeExpression(ctx.scopeExpression());
        return new LamaWhileNode(cond, body);
    }

    @Override
    public LamaNode visitDoWhileLoop(LamaParser.DoWhileLoopContext ctx) {
        var body = visitScopeExpression(ctx.scopeExpression(), false);
        var cond = visit(ctx.expression());
        this.state.leaveScope();
        return new LamaExpressionListNode(body, new LamaWhileNode(cond, body));
    }

    @Override
    public LamaNode visitForLoop(LamaParser.ForLoopContext ctx) {
        var init = visitScopeExpression(ctx.init, false);
        var stop = visit(ctx.stop);
        var update = visit(ctx.update);
        var body = visitScopeExpression(ctx.body);
        this.state.leaveScope();
        return new LamaExpressionListNode(init, new LamaWhileNode(stop, new LamaExpressionListNode(body, update)));
    }

    // Boolean literals
    @Override
    public LamaNode visitBooleanLiteral(LamaParser.BooleanLiteralContext ctx) {
        var value = switch (ctx.val.getType()) {
            case LamaLexer.FALSE -> false;
            case LamaLexer.TRUE -> true;
            default -> throw new IllegalStateException("Unexpected value: " + ctx.val.getType());
        };
        return new LamaBooleanLiteralNode(value);
    }
}
