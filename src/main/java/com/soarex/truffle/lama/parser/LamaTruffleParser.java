package com.soarex.truffle.lama.parser;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.soarex.truffle.lama.LamaLanguage;
import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.parser.LamaLexer;
import com.soarex.truffle.lama.parser.LamaParser;
import com.soarex.truffle.lama.runtime.GlobalScope;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.Reader;

public final class LamaTruffleParser {
    private final LamaLanguage lamaLanguage;

    public LamaTruffleParser(LamaLanguage lamaLanguage) {
        this.lamaLanguage = lamaLanguage;
    }

    public ParseResult parse(String code) {
        return parse(CharStreams.fromString(code));
    }

    public ParseResult parse(Reader code) throws IOException {
        return parse(CharStreams.fromReader(code));
    }

    private ParseResult parse(CharStream inputStream) {
        var lexer = new LamaLexer(inputStream);
        var parser = new LamaParser(new CommonTokenStream(lexer));
        lexer.removeErrorListeners();

        parser.removeErrorListeners();
        parser.setErrorHandler(new BailErrorStrategy());
        var scopeExpr = parser.program().scopeExpression();

        var visitor = new TruffleAstBuildVisitor(lamaLanguage);
        var expr = visitor.visitScopeExpression(scopeExpr);
        return new ParseResult(expr);
    }

    public record ParseResult(LamaNode expr) {
    }
}
