package com.soarex.truffle.lama.nodes.variables;

import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.Specialization;
import com.soarex.truffle.lama.LamaException;
import com.soarex.truffle.lama.nodes.LamaNode;

@NodeField(name = "name", type = String.class)
public abstract class GlobalVarReferenceExprNode extends LamaNode {
    public abstract String getName();

    @Specialization
    Object readVariable() {
        var name = getName();
        var value = this.currentLanguageContext().globalScopeObject.getVariable(name);
        if (value == null) {
            throw new LamaException(this, "'" + name + "' is not defined");
        }
        return value;
    }
}
