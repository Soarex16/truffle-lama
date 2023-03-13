package com.soarex.truffle.lama.nodes.expr;

import com.oracle.truffle.api.dsl.NodeChild;
import com.soarex.truffle.lama.nodes.LamaNode;

@NodeChild("left")
@NodeChild("right")
public abstract class BinaryOperation extends LamaNode {
}
