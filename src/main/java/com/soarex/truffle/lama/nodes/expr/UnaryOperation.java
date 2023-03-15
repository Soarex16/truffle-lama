package com.soarex.truffle.lama.nodes.expr;

import com.oracle.truffle.api.dsl.NodeChild;
import com.soarex.truffle.lama.nodes.LamaNode;

@NodeChild("value")
public abstract class UnaryOperation extends LamaNode {
}
