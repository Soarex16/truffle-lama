package com.soarex.truffle.lama.nodes.variables;

import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.strings.TruffleString;
import com.soarex.truffle.lama.LamaLanguageContext;
import com.soarex.truffle.lama.nodes.LamaNode;

import java.util.Arrays;

@NodeField(name = "slot", type = int.class)
public abstract class ReadLocalVariableNode extends LamaNode {
    public abstract int getSlot();

    @Specialization(guards = "frame.isBoolean(getSlot())")
    protected boolean readBoolean(VirtualFrame frame) {
        return frame.getBoolean(getSlot());
    }

    @Specialization(guards = "frame.isInt(getSlot())")
    protected int readInt(VirtualFrame frame) {
        return frame.getInt(getSlot());
    }

    @Specialization(replaces = {"readBoolean", "readInt"})
    protected Object readObject(VirtualFrame frame) {
        return frame.getObject(getSlot());
    }

    public Object getName() {
        return getRootNode().getFrameDescriptor().getSlotName(getSlot());
    }
}
