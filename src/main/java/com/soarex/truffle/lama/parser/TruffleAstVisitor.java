package com.soarex.truffle.lama.parser;

import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.nodes.LamaNumberLiteralNode;
import com.soarex.truffle.lama.nodes.expr.arithmetics.*;
import com.soarex.truffle.lama.parser.LamaLexer;
import com.soarex.truffle.lama.parser.LamaParser;
import com.soarex.truffle.lama.parser.LamaParserBaseVisitor;

public class TruffleAstVisitor extends LamaParserBaseVisitor<LamaNode> {
    @Override
    public LamaNode visitAssocExpression(LamaParser.AssocExpressionContext ctx) {
        var lhs = this.visit(ctx.lhs);
        var rhs = this.visit(ctx.rhs);

        return switch (ctx.operator.getType()) {
            case LamaLexer.PLUS -> LamaAddNodeGen.create(lhs, rhs);
            case LamaLexer.MINUS -> LamaSubNodeGen.create(lhs, rhs);
            case LamaLexer.MUL -> LamaMulNodeGen.create(lhs, rhs);
            case LamaLexer.DIV -> LamaDivNodeGen.create(lhs, rhs);
            case LamaLexer.MOD -> LamaModNodeGen.create(lhs, rhs);
            case LamaLexer.OP_OR -> throw new UnsupportedOperationException("TODO");
            case LamaLexer.OP_AND -> throw new UnsupportedOperationException("TODO");
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
}
