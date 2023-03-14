package com.soarex.truffle.lama.nodes.expr.arithmetics;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.soarex.truffle.lama.LamaException;
import com.soarex.truffle.lama.nodes.expr.BinaryOperation;

@NodeInfo(shortName = "&&")
public abstract class LamaAndNode extends BinaryOperation {
    @Specialization
    protected boolean and(boolean left, boolean right) {
        return left && right;
    }

//    @Specialization
//    protected boolean and(int left, int right) {
//        return and(left != 0, right != 0);
//    }

    @Fallback
    protected Object typeError(Object left, Object right) {
        throw LamaException.typeError(this, left, right);
    }
}
