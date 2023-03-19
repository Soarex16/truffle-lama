package com.soarex.truffle.lama.nodes.variables;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.soarex.truffle.lama.nodes.LamaNode;

public class WriteArgumentNode extends LamaNode {
    private final int index;

    @SuppressWarnings("FieldMayBeFinal")
    @Child
    private LamaNode value;

    public WriteArgumentNode(int index, LamaNode value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object[] args = frame.getArguments();
        Object value = this.value.executeGeneric(frame);
        args[index] = value;
        return value;
    }
}
