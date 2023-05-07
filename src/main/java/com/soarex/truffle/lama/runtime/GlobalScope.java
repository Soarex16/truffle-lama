package com.soarex.truffle.lama.runtime;

import com.oracle.truffle.api.strings.TruffleString;
import com.soarex.truffle.lama.LamaException;

import java.util.HashMap;
import java.util.Map;

public final class GlobalScope {
    private final Map<TruffleString, Object> vars = new HashMap<>();

    public void newVar(TruffleString name, Object value) {
        vars.putIfAbsent(name, value);
    }

    public void updateVar(TruffleString name, Object value) {
        var newVal = vars.computeIfPresent(name, (k, v) -> value);
        if (newVal == null) throw new LamaException("Trying to update not declared var '" + name + "'");
    }

    public Object getVar(TruffleString name) {
        return vars.get(name);
    }
}
