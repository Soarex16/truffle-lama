package com.soarex.truffle.lama.runtime;

import java.util.HashMap;
import java.util.Map;

public final class GlobalScopeObject {
    private final Map<String, Object> variables = new HashMap<>();

    public void newVariable(String name) {
        this.variables.putIfAbsent(name, LamaNull.INSTANCE);
    }

    public boolean updateVariable(String name, Object value) {
        Object existingValue = this.variables.computeIfPresent(name, (k, v) -> value);
        return existingValue != null;
    }

    public Object getVariable(String name) {
        return this.variables.get(name);
    }
}
