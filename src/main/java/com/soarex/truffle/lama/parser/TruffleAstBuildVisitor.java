package com.soarex.truffle.lama.parser;

import com.soarex.truffle.lama.nodes.LamaBooleanLiteralNode;
import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.nodes.LamaNumberLiteralNode;
import com.soarex.truffle.lama.nodes.expr.arithmetics.*;
import com.soarex.truffle.lama.parser.LamaLexer;
import com.soarex.truffle.lama.parser.LamaParser;
import com.soarex.truffle.lama.parser.LamaParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

/* package private */ final class TruffleAstBuildVisitor extends LamaParserBaseVisitor<LamaNode> {
    @Override
    public LamaNode visitProgram(LamaParser.ProgramContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public LamaNode visitBinaryExpression(LamaParser.BinaryExpressionContext ctx) {
        var lhs = this.visit(ctx.lhs);
        var rhs = this.visit(ctx.rhs);

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

    // Number literals
    @Override
    public LamaNode visitPositive(LamaParser.PositiveContext ctx) {
        var num = Integer.parseInt(ctx.num.getText());
        return new LamaNumberLiteralNode(num);
    }

    @Override
    public LamaNode visitNegative(LamaParser.NegativeContext ctx) {
        var num = -Integer.parseInt(ctx.num.getText());
        return new LamaNumberLiteralNode(num);
    }

    @Override
    public LamaNode visitTrue(LamaParser.TrueContext ctx) {
        return new LamaBooleanLiteralNode(true);
    }

    @Override
    public LamaNode visitFalse(LamaParser.FalseContext ctx) {
        return new LamaBooleanLiteralNode(false);
    }
}
