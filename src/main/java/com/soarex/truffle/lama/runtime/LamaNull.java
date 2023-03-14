package com.soarex.truffle.lama.runtime;

import com.oracle.truffle.api.library.ExportLibrary;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.TruffleObject;

@ExportLibrary(InteropLibrary.class)
public final class LamaNull implements TruffleObject {
    public static final LamaNull INSTANCE = new LamaNull();

    private LamaNull() {
    }
}
