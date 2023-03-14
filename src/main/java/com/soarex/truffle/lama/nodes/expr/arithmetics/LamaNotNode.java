package com.soarex.truffle.lama.nodes.expr.arithmetics;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.soarex.truffle.lama.LamaException;
import com.soarex.truffle.lama.nodes.LamaNode;

@NodeChild("value")
@NodeInfo(shortName = "!")
public abstract class LamaNotNode extends LamaNode {
    @Specialization
    protected boolean not(boolean value) {
        return !value;
    }

    @Fallback
    protected Object typeError(Object value) {
        throw LamaException.typeError(this, value);
    }
}
