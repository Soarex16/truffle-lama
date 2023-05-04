package com.soarex.truffle.lama.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "literal(int)")
public class LamaNumberLiteralNode extends LamaNode {
    private final int value;

    public LamaNumberLiteralNode(int value) {
        this.value = value;
    }

    @Override
    public int executeInt(VirtualFrame frame) {
        return value;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return value;
    }
}
