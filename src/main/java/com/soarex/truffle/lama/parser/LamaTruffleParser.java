package com.soarex.truffle.lama.parser;

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

    private LamaTruffleParser() { }

    public static LamaNode parse(String code) {
        return parse(CharStreams.fromString(code));
    }

    public static LamaNode parse(Reader code) throws IOException {
        return parse(CharStreams.fromReader(code));
    }

    private static LamaNode parse(CharStream inputStream) {
        var lexer = new LamaLexer(inputStream);
        var parser = new LamaParser(new CommonTokenStream(lexer));
        lexer.removeErrorListeners();

        parser.removeErrorListeners();
        parser.setErrorHandler(new BailErrorStrategy());
        var scopeExpr = parser.program().scopeExpression();

        var visitor = new TruffleAstBuildVisitor();
        return visitor.visitScopeExpression(scopeExpr);
    }
}
