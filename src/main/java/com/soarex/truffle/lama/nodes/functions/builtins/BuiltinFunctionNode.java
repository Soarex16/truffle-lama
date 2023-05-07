package com.soarex.truffle.lama.nodes.functions.builtins;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.runtime.FunctionObject;

public class BuiltinFunctionNode extends LamaNode {

    private final FunctionObject functionObject;

    public BuiltinFunctionNode(FunctionObject functionObject) {
        this.functionObject = functionObject;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return functionObject;
    }
}
