package com.soarex.truffle.lama.nodes.variables;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.strings.TruffleString;
import com.soarex.truffle.lama.nodes.LamaNode;

@NodeInfo(shortName = "read(global)")
public final class ReadGlobalVarNode extends LamaNode {
    private final TruffleString name;

    public ReadGlobalVarNode(TruffleString name) {
        this.name = name;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return currentLanguageContext().globalScope.getVar(name);
    }

    public TruffleString getName() {
        return name;
    }
}
