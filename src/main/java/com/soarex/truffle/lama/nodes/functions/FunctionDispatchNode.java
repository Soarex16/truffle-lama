package com.soarex.truffle.lama.nodes.functions;

import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.DirectCallNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.soarex.truffle.lama.LamaException;
import com.soarex.truffle.lama.runtime.FunctionObject;

@NodeInfo(shortName = "dispatcher")
public abstract class FunctionDispatchNode extends Node {

    @Specialization(guards = "func.callTarget == directCallNode.getCallTarget()", limit = "1")
    protected static Object dispatchDirectly(
            @SuppressWarnings("unused") FunctionObject func,
            Object[] args,
            @Cached("create(func.callTarget)") DirectCallNode directCallNode) {
        return directCallNode.call(args);
    }

    public abstract Object executeDispatch(Object func, Object[] args);

    @SuppressWarnings("unused")
    @Fallback
    protected Object targetIsNotAFunction(Object nonFunc, Object[] args) {
        throw LamaException.typeError(this, nonFunc);
    }
}
