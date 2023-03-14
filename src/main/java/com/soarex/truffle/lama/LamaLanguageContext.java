package com.soarex.truffle.lama;

import com.soarex.truffle.lama.runtime.GlobalScopeObject;

public final class LamaLanguageContext {
    public final GlobalScopeObject globalScopeObject;

    public LamaLanguageContext() {
        this.globalScopeObject = new GlobalScopeObject();
    }
}
