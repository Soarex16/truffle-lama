package com.soarex.truffle.lama.parser;

import com.oracle.truffle.api.strings.TruffleString;

public interface FrameMember {
    record FunctionParameter(int index) implements FrameMember {
        @Override
        public String toString() {
            return "param(" + index + ")";
        }
    }

    public interface Var extends FrameMember {}

    record LocalVariable(int index) implements Var {
        @Override
        public String toString() {
            return "local(" + index + ")";
        }
    }

    record GlobalVariable(TruffleString name) implements Var {
        @Override
        public String toString() {
            return "global(" + name.toString() + ")";
        }
    }

    record Function() implements FrameMember {
    }
}
