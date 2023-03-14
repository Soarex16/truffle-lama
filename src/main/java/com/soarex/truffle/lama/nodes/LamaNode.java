package com.soarex.truffle.lama.nodes;

import com.oracle.truffle.api.dsl.TypeSystemReference;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.soarex.truffle.lama.LamaTypeSystem;
import com.soarex.truffle.lama.LamaTypeSystemGen;

@TypeSystemReference(LamaTypeSystem.class)
public abstract class LamaNode extends Node {

    public int executeInt(VirtualFrame frame) throws UnexpectedResultException {
        return LamaTypeSystemGen.expectInteger(executeGeneric(frame));
    }

    public abstract Object executeGeneric(VirtualFrame frame);
}
