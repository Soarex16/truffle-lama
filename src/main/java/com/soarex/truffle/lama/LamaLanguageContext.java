package com.soarex.truffle.lama;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.nodes.Node;
import com.soarex.truffle.lama.runtime.GlobalScopeObject;

public final class LamaLanguageContext {
    private static final TruffleLanguage.ContextReference<LamaLanguageContext> REFERENCE =
            TruffleLanguage.ContextReference.create(LamaLanguage.class);

    public final GlobalScopeObject globalScopeObject;

    public LamaLanguageContext() {
        this.globalScopeObject = new GlobalScopeObject();
    }

    public static LamaLanguageContext get(Node node) {
        return REFERENCE.get(node);
    }
}
