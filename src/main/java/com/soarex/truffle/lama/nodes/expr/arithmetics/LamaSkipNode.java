package com.soarex.truffle.lama.nodes.expr.arithmetics;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.runtime.LamaNull;

@NodeInfo(shortName = "skip")
public class LamaSkipNode extends LamaNode {
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return LamaNull.INSTANCE;
    }
}
