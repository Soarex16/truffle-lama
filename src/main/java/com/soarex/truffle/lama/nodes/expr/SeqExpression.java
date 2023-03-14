package com.soarex.truffle.lama.nodes.expr;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.soarex.truffle.lama.nodes.LamaNode;

@NodeInfo(shortName = ";")
@NodeChild("expr1")
@NodeChild("expr2")
public abstract class SeqExpression extends LamaNode {
    @Specialization
    protected Object seq(Object expr1, Object expr2) {
        return expr2;
    }
}
