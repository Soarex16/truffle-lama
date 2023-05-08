package com.soarex.truffle.lama.nodes.functions;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;
import com.soarex.truffle.lama.LamaLanguage;
import com.soarex.truffle.lama.nodes.LamaNode;

public final class FunctionRootNode extends RootNode {
    @SuppressWarnings("FieldMayBeFinal")
    @Child
    private LamaNode body;

    public FunctionRootNode(LamaLanguage lamaLanguage, LamaNode body) {
        super(lamaLanguage);
        this.body = body;
    }

    public FunctionRootNode(LamaLanguage lamaLanguage, LamaNode body, FrameDescriptor frameDescriptor) {
        super(lamaLanguage, frameDescriptor);
        this.body = body;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return body.executeGeneric(frame);
    }
}
