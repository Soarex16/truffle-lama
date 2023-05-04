package com.soarex.truffle.lama.nodes.expr.control;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.LoopNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RepeatingNode;
import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.runtime.LamaNull;

@SuppressWarnings("FieldMayBeFinal")
@NodeInfo(shortName = "while")
public final class LamaWhileNode extends LamaNode {
    @Child
    private LoopNode loopNode;

    public LamaWhileNode(LamaNode cond, LamaNode body) {
        loopNode = Truffle.getRuntime().createLoopNode(
                new WhileRepeatingNode(cond, body)
        );
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        loopNode.execute(frame);
        return LamaNull.INSTANCE;
    }

    private static final class WhileRepeatingNode extends Node implements RepeatingNode {
        @Child
        private LamaNode cond;
        @Child
        private LamaNode body;

        private WhileRepeatingNode(LamaNode cond, LamaNode body) {
            this.cond = cond;
            this.body = body;
        }

        @Override
        public boolean executeRepeating(VirtualFrame frame) {
            if (cond.executeGeneric(frame).equals(0)) {
                return false;
            }
            body.executeGeneric(frame);
            return true;
        }
    }
}
