package com.soarex.truffle.lama.parser;

import com.oracle.truffle.api.strings.TruffleString;
import com.soarex.truffle.lama.LamaLanguage;
import com.soarex.truffle.lama.nodes.*;
import com.soarex.truffle.lama.nodes.expr.SeqExpression;
import com.soarex.truffle.lama.nodes.expr.SeqExpressionNodeGen;
import com.soarex.truffle.lama.nodes.expr.arithmetics.*;
import com.soarex.truffle.lama.nodes.variables.*;
import com.soarex.truffle.lama.parser.LamaLexer;
import com.soarex.truffle.lama.parser.LamaParser;
import com.soarex.truffle.lama.parser.LamaParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.Objects;

/* package private */ final class TruffleAstBuildVisitor extends LamaParserBaseVisitor<LamaNode> {
    @Override
    public LamaNode visitProgram(LamaParser.ProgramContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public LamaNode visitScopeExpression(LamaParser.ScopeExpressionContext ctx) {
        var scopeExpr = visit(ctx.expr);
        if (ctx.defs.size() > 0) {
            return SeqExpressionNodeGen.create(expandScopeDefinitions(ctx), scopeExpr);
        } else {
            return scopeExpr;
        }
    }

    @Override
    public LamaNode visitExpression(LamaParser.ExpressionContext ctx) {
        return seq(ctx.basicExpression().stream().map(this::visit).toList());
    }

    // TODO: when we add scope we need to get rid of the Seq and replace it with LamaNode[]
    //  as child nodes of the scope.
    private LamaNode expandScopeDefinitions(LamaParser.ScopeExpressionContext ctx) {
        var defsCollector = new DefinitionCollector();
        defsCollector.visitScopeExpression(ctx);

        LamaNode definitions = seq(
                defsCollector
                        .getDefinitions()
                        .stream()
                        .map(this::visit)
                        .filter(Objects::nonNull) // TODO: function definitions
                        .toList()
        );

        var assignments = seq(
                defsCollector
                        .getVariableAssignments()
                        .stream()
                        .map(assn -> AssignmentNodeGen.create(visit(assn.value()), assn.name()))
                        .toList()
        );

        return SeqExpressionNodeGen.create(definitions, assignments);
    }

    private LamaNode seq(List<? extends LamaNode> nodes) {
        assert !nodes.isEmpty();

        // foldr
        var acc = nodes.get(nodes.size() - 1);
        for (int i = nodes.size() - 2; i >= 0; i--) {
            var expr = nodes.get(i);
            acc = SeqExpressionNodeGen.create(expr, acc);
        }

        return acc;
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
