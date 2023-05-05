package com.soarex.truffle.lama.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.soarex.truffle.lama.runtime.LamaNull;

import java.util.List;

@NodeInfo(shortName = "seq")
public final class LamaExpressionListNode extends LamaNode {
    @Children
    private final LamaNode[] expressions;

    public LamaExpressionListNode(LamaNode... nodes) {
        this.expressions = nodes;
    }

    public LamaExpressionListNode(List<? extends LamaNode> expressions) {
        this.expressions = expressions.toArray(new LamaNode[0]);
    }

    @Override
    @ExplodeLoop
    public Object executeGeneric(VirtualFrame frame) {
        Object ret = LamaNull.INSTANCE;
        for (LamaNode expression : expressions) {
            ret = expression.executeGeneric(frame);
        }
        return ret;
    }
}
