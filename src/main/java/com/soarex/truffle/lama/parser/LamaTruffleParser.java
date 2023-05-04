package com.soarex.truffle.lama.parser;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.parser.LamaLexer;
import com.soarex.truffle.lama.parser.LamaParser;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.Reader;

public final class LamaTruffleParser {
    private LamaTruffleParser() {
    }

    public static ParseResult parse(String code) {
        return parse(CharStreams.fromString(code));
    }

    public static ParseResult parse(Reader code) throws IOException {
        return parse(CharStreams.fromReader(code));
    }

    private static ParseResult parse(CharStream inputStream) {
        var lexer = new LamaLexer(inputStream);
        var parser = new LamaParser(new CommonTokenStream(lexer));
        lexer.removeErrorListeners();

        parser.removeErrorListeners();
        parser.setErrorHandler(new BailErrorStrategy());
        var scopeExpr = parser.program().scopeExpression();

        var visitor = new TruffleAstBuildVisitor();
        visitor.state.enterFunction();
        var expr = visitor.visitScopeExpression(scopeExpr);
        var frame = visitor.state.leaveFunction();
        return new ParseResult(frame, expr);
    }

    public record ParseResult(FrameDescriptor frame, LamaNode expr) {
    }
}
