package com.soarex.truffle.lama.nodes.expr.arithmetics;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.soarex.truffle.lama.LamaException;
import com.soarex.truffle.lama.nodes.expr.BinaryOperation;

@NodeInfo(shortName = "*")
public abstract class LamaMulNode extends BinaryOperation {
    @Specialization(rewriteOn = ArithmeticException.class)
    protected int mul(int left, int right) throws ArithmeticException {
        return Math.multiplyExact(left, right);
    }

    @Fallback
    protected Object typeError(Object left, Object right) {
        throw LamaException.typeError(this, left, right);
    }
}
