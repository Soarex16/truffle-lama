package com.soarex.truffle.lama.runtime;

import com.oracle.truffle.api.CallTarget;

public final class FunctionObject {
    public final CallTarget callTarget;

    public FunctionObject(CallTarget callTarget) {
        this.callTarget = callTarget;
    }
}
