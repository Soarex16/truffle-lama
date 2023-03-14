package com.soarex.truffle.lama.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;

public class LamaBooleanLiteralNode extends LamaNode {
    private final boolean value;

    public LamaBooleanLiteralNode(boolean value) {
        this.value = value;
    }

    @Override
    public int executeInt(VirtualFrame frame) throws UnexpectedResultException {
        return LamaTypeSystem.castBooleanToInt(value);
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return value;
    }
}
