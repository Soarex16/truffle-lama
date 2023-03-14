package com.soarex.truffle.lama.nodes.variables;

import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.Specialization;
import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.runtime.LamaNull;

@NodeField(name = "name", type = String.class)
public abstract class GlobalVarDeclarationNode extends LamaNode {
    public abstract String getName();

    @Specialization
    protected Object createVariable() {
        this.currentLanguageContext().globalScopeObject.newVariable(getName());
        return LamaNull.INSTANCE;
    }
}
