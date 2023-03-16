package com.soarex.truffle.lama.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;

import java.util.List;

public final class LamaExpressionListNode extends LamaNode {
    @Children
    private final LamaNode[] expressions;

    public LamaExpressionListNode(List<? extends LamaNode> expressions) {
        this.expressions = expressions.toArray(new LamaNode[0]);
    }

    @Override
    @ExplodeLoop
    public Object executeGeneric(VirtualFrame frame) {
        for (int i = 0; i < expressions.length - 1; i++) {
            expressions[i].executeGeneric(frame);
        }
        return expressions[expressions.length - 1].executeGeneric(frame);
    }
}
