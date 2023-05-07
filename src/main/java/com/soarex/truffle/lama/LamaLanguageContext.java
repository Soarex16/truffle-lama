package com.soarex.truffle.lama;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.nodes.Node;
import com.soarex.truffle.lama.runtime.GlobalScope;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public final class LamaLanguageContext {
    private static final TruffleLanguage.ContextReference<LamaLanguageContext> REFERENCE =
            TruffleLanguage.ContextReference.create(LamaLanguage.class);

    public final GlobalScope globalScope = new GlobalScope();

    private final BufferedReader input;
    private final PrintWriter output;

    public LamaLanguageContext(TruffleLanguage.Env env) {
        this.input = new BufferedReader(new InputStreamReader(env.in()));
        this.output = new PrintWriter(env.out(), true);
    }

    public static LamaLanguageContext get(Node node) {
        return REFERENCE.get(node);
    }

    public BufferedReader getInput() {
        return input;
    }

    public PrintWriter getOutput() {
        return output;
    }
}
