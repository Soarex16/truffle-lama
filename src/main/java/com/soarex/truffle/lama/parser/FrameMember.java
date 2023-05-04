package com.soarex.truffle.lama.parser;

public interface FrameMember {
    record FunctionParameter(int index) implements FrameMember {
        @Override
        public String toString() {
            return "param(" + index + ")";
        }
    }

    record LocalVariable(int index) implements FrameMember {
        @Override
        public String toString() {
            return "local(" + index + ")";
        }
    }

    record Function() implements FrameMember {
    } // TODO
}
