package com.soarex.truffle.lama.nodes.variables;


import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.strings.TruffleString;
import com.soarex.truffle.lama.nodes.LamaNode;

@NodeInfo(shortName = "write(global)")
@NodeChild("value")
@NodeField(name = "name", type = TruffleString.class)
public abstract class WriteGlobalVarNode extends LamaNode {
    protected abstract TruffleString getName();

    @Specialization
    protected Object write(VirtualFrame frame, Object value) {
        currentLanguageContext().globalScope.updateVar(getName(), value);
        return value;
    }
}
