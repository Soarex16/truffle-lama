package com.soarex.truffle.lama.nodes.variables;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.runtime.LamaNull;

@NodeInfo(shortName = "local")
public final class LocalVarDeclarationNode extends LamaNode {
    private final int slot;

    public LocalVarDeclarationNode(int slot) {
        this.slot = slot;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        frame.setObject(slot, LamaNull.INSTANCE);
        return LamaNull.INSTANCE;
    }

    public Object getName() {
        return getRootNode().getFrameDescriptor().getSlotName(slot);
    }
}
