package com.soarex.truffle.lama.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

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
