package com.soarex.truffle.lama.parser;

import com.oracle.truffle.api.strings.TruffleString;
import com.soarex.truffle.lama.LamaLanguage;
import com.soarex.truffle.lama.nodes.*;
import com.soarex.truffle.lama.nodes.expr.arithmetics.*;
import com.soarex.truffle.lama.nodes.expr.control.*;
import com.soarex.truffle.lama.nodes.variables.*;
import com.soarex.truffle.lama.parser.LamaLexer;
import com.soarex.truffle.lama.parser.LamaParser;
import com.soarex.truffle.lama.parser.LamaParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* package private */ final class TruffleAstBuildVisitor extends LamaParserBaseVisitor<LamaNode> {
    @Override
    public LamaNode visitProgram(LamaParser.ProgramContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public LamaNode visitScopeExpression(LamaParser.ScopeExpressionContext ctx) {
        var scopeExpr = visit(ctx.expr);
        if (ctx.defs.size() > 0) {
            var defs = expandScopeDefinitions(ctx);
            defs.add(scopeExpr);
            return new LamaExpressionListNode(defs);
        } else {
            return scopeExpr;
        }
    }

    @Override
    public LamaNode visitExpression(LamaParser.ExpressionContext ctx) {
        return new LamaExpressionListNode(ctx.basicExpression().stream().map(this::visit).toList());
    }

    // TODO: when we add scope we need to get rid of the Seq and replace it with LamaNode[]
    //  as child nodes of the scope.
    private List<LamaNode> expandScopeDefinitions(LamaParser.ScopeExpressionContext ctx) {
        var defsCollector = new DefinitionCollector();
        defsCollector.visitScopeExpression(ctx);

        var expressions = new ArrayList<LamaNode>();

        // definitions
        defsCollector
                .getDefinitions()
                .stream()
                .map(this::visit)
                .filter(Objects::nonNull) // TODO: function definitions
                .collect(Collectors.toCollection(() -> expressions));

        // assignments
        defsCollector
                .getVariableAssignments()
                .stream()
                .map(assn -> AssignmentNodeGen.create(visit(assn.value()), assn.name()))
                .collect(Collectors.toCollection(() -> expressions));

        return expressions;
    }

    @Override
    public LamaNode visitVariableDefinitionItem(LamaParser.VariableDefinitionItemContext ctx) {
        return GlobalVarDeclarationNodeGen.create(ctx.name.getText());
    }

    @Override
    public LamaNode visitFunctionDefinition(LamaParser.FunctionDefinitionContext ctx) {
        return null; // TODO: functions
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
            case LamaLexer.ASSIGN -> throw new UnsupportedOperationException("TODO");
            default -> throw new IllegalStateException("Unexpected value: " + ctx.operator);
        };
    }

    @Override
    public LamaNode visitIdentifier(LamaParser.IdentifierContext ctx) {
        return GlobalVarReferenceExprNodeGen.create(ctx.L_IDENT().getText());
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
    public LamaNode visitSkip(LamaParser.SkipContext ctx) {
        return new LamaSkipNode();
    }

    // String literal
    @Override
    public LamaNode visitStringLiteral(LamaParser.StringLiteralContext ctx) {
        var text = removeQuotes(ctx.STRING_LITERAL().getText());
        var truffleString = TruffleString.fromJavaStringUncached(text, LamaLanguage.STRING_ENCODING);
        return new LamaStringLiteralNode(truffleString);
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

    // Boolean literals
    @Override
    public LamaNode visitTrue(LamaParser.TrueContext ctx) {
        return new LamaBooleanLiteralNode(true);
    }

    @Override
    public LamaNode visitFalse(LamaParser.FalseContext ctx) {
        return new LamaBooleanLiteralNode(false);
    }
}
