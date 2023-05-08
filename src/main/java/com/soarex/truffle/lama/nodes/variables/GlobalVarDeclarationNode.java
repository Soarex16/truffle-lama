package com.soarex.truffle.lama.nodes.variables;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.strings.TruffleString;
import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.runtime.LamaNull;

@NodeInfo(shortName = "global")
public final class GlobalVarDeclarationNode extends LamaNode {
    private final TruffleString name;

    public GlobalVarDeclarationNode(TruffleString name) {
        this.name = name;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        currentLanguageContext().globalScope.newVar(this.name, LamaNull.INSTANCE);
        return LamaNull.INSTANCE;
    }
}
