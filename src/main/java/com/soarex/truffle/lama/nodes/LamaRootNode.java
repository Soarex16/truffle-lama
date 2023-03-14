package com.soarex.truffle.lama.nodes;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;

public final class LamaRootNode extends RootNode {
    @SuppressWarnings("FieldMayBeFinal")
    @Child
    private LamaNode root;

    public LamaRootNode(TruffleLanguage<?> language, LamaNode root) {
        super(language);
        this.root = root;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return root.executeGeneric(frame);
    }
}
