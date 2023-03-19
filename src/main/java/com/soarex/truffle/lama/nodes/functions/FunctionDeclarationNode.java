package com.soarex.truffle.lama.nodes.functions;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.strings.TruffleString;
import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.runtime.LamaNull;

public final class FunctionDeclarationNode extends LamaNode {
    private final TruffleString name;
    private final FrameDescriptor frameDescriptor;
    private final int parametersCount;

    @SuppressWarnings("FieldMayBeFinal")
    @Child
    private LamaNode funcBody;

    public FunctionDeclarationNode(TruffleString name, FrameDescriptor frameDescriptor, int parametersCount, LamaNode funcBody) {
        this.name = name;
        this.frameDescriptor = frameDescriptor;
        this.parametersCount = parametersCount;
        this.funcBody = funcBody;
    }

    @ExplodeLoop
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        // TODO: add to functions in language scope, add new functions scope
        return LamaNull.INSTANCE;
    }
}
