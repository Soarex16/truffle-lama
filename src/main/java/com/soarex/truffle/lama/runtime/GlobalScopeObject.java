package com.soarex.truffle.lama.runtime;

import java.util.HashMap;
import java.util.Map;

public final class GlobalScopeObject {
    private final Map<String, Object> variables = new HashMap<>();

    public boolean newVariable(String name, Object value) {
        Object existingValue = this.variables.putIfAbsent(name, value);
        return existingValue == null;
    }

    public boolean updateVariable(String name, Object value) {
        Object existingValue = this.variables.computeIfPresent(name, (k, v) -> value);
        return existingValue != null;
    }

    public Object getVariable(String name) {
        return this.variables.get(name);
    }
}
