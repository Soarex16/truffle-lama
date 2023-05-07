package com.soarex.truffle.lama.nodes.functions;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.strings.TruffleString;
import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.runtime.FunctionObject;
import com.soarex.truffle.lama.runtime.LamaNull;

@NodeInfo(shortName = "fun")
public final class FunctionDeclarationNode extends LamaNode {
    private final TruffleString name;
    private final FrameDescriptor frameDescriptor;
    @SuppressWarnings("FieldMayBeFinal")
    @Child
    private LamaNode funcBody;

    public FunctionDeclarationNode(TruffleString name, FrameDescriptor frameDescriptor, LamaNode funcBody) {
        this.name = name;
        this.frameDescriptor = frameDescriptor;
        this.funcBody = funcBody;
    }

    @ExplodeLoop
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        var root = new FunctionRootNode(currentTruffleLanguage(), this.funcBody, this.frameDescriptor);
        var obj = new FunctionObject(root.getCallTarget());
        currentLanguageContext().globalScope.newVar(name, obj);
        return LamaNull.INSTANCE;
    }
}
