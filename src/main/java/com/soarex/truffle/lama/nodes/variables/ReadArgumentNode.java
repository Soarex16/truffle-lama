package com.soarex.truffle.lama.nodes.variables;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.soarex.truffle.lama.nodes.LamaNode;

@NodeInfo(shortName = "read(arg)")
public class ReadArgumentNode extends LamaNode {
    private final int index;

    public ReadArgumentNode(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return frame.getArguments()[index];
    }
}
