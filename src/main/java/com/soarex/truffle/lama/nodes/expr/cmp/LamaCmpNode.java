package com.soarex.truffle.lama.nodes.expr.cmp;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.soarex.truffle.lama.LamaException;
import com.soarex.truffle.lama.nodes.expr.BinaryOperation;

@NodeInfo(shortName = "cmp")
@NodeField(name = "op", type = LamaCmpNode.Op.class)
public abstract class LamaCmpNode extends BinaryOperation {
    abstract protected Op getOp();

    @Specialization
    protected boolean cmp(int lhs, int rhs) {
        return switch (getOp()) {
            case LT -> lhs < rhs;
            case LE -> lhs <= rhs;
            case EQ -> lhs == rhs;
            case NEQ -> lhs != rhs;
            case GE -> lhs >= rhs;
            case GT -> lhs > rhs;
        };
    }

    @Fallback
    protected Object typeError(Object lhs, Object rhs) {
        throw LamaException.typeError(this, lhs, rhs);
    }

    public enum Op {
        LT("<"), LE("<="), EQ("=="), NEQ("/="), GE(">="), GT(">");

        private final String repr;

        Op(String repr) {
            this.repr = repr;
        }

        public static Op fromRepr(String repr) {
            for (var value : values()) {
                if (value.repr.equals(repr)) {
                    return value;
                }
            }
            throw new IllegalArgumentException("No such comparison operation: '" + repr + "'");
        }
    }
}
