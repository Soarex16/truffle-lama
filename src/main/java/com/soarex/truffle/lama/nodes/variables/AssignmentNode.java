package com.soarex.truffle.lama.nodes.variables;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.Specialization;
import com.soarex.truffle.lama.LamaException;
import com.soarex.truffle.lama.nodes.LamaNode;

@NodeChild(value = "value")
@NodeField(name = "name", type = String.class)
public abstract class AssignmentNode extends LamaNode {
    public abstract String getName();

    @Specialization
    protected Object assign(Object value) {
        var name = getName();
        if (!this.currentLanguageContext().globalScopeObject.updateVariable(name, value)) {
            throw new LamaException(this, "'" + name + "' is not defined");
        }
        return value;
    }
}
