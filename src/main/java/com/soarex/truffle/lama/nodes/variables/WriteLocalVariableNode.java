package com.soarex.truffle.lama.nodes.variables;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.soarex.truffle.lama.nodes.LamaNode;

@SuppressWarnings("unused")
@NodeInfo(shortName = "write(local)")
@NodeChild("value")
@NodeField(name = "slot", type = int.class)
public abstract class WriteLocalVariableNode extends LamaNode {
    protected abstract int getSlot();

    @Specialization(guards = "isBooleanOrIllegal(frame)")
    protected boolean writeBoolean(VirtualFrame frame, boolean value) {
        frame.getFrameDescriptor().setSlotKind(getSlot(), FrameSlotKind.Boolean);
        frame.setBoolean(getSlot(), value);
        return value;
    }

    @Specialization(guards = "isIntOrIllegal(frame)")
    protected int writeInt(VirtualFrame frame, int value) {
        frame.getFrameDescriptor().setSlotKind(getSlot(), FrameSlotKind.Int);
        frame.setInt(getSlot(), value);
        return value;
    }

    @Fallback
    protected Object write(VirtualFrame frame, Object value) {
        frame.getFrameDescriptor().setSlotKind(getSlot(), FrameSlotKind.Object);
        frame.setObject(getSlot(), value);
        return value;
    }

    protected boolean isBooleanOrIllegal(VirtualFrame frame) {
        final FrameSlotKind kind = frame.getFrameDescriptor().getSlotKind(getSlot());
        return kind == FrameSlotKind.Boolean;
    }

    protected boolean isIntOrIllegal(VirtualFrame frame) {
        final FrameSlotKind kind = frame.getFrameDescriptor().getSlotKind(getSlot());
        return kind == FrameSlotKind.Int || kind == FrameSlotKind.Illegal;
    }

    public Object getName() {
        return getRootNode().getFrameDescriptor().getSlotName(getSlot());
    }
}
