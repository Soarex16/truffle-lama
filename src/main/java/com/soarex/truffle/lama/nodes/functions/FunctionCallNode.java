package com.soarex.truffle.lama.nodes.functions;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.soarex.truffle.lama.nodes.LamaNode;

import java.util.List;

@SuppressWarnings("FieldMayBeFinal")
@NodeInfo(shortName = "call")
public class FunctionCallNode extends LamaNode {
    @Children
    private final LamaNode[] argumentNodes;
    @Child
    private LamaNode functionNode;
    @Child
    private FunctionDispatchNode dispatchNode;

    public FunctionCallNode(LamaNode functionNode, List<? extends LamaNode> argumentNodes) {
        this(functionNode, argumentNodes.toArray(new LamaNode[0]));
    }

    public FunctionCallNode(LamaNode functionNode, LamaNode... argumentNodes) {
        this.functionNode = functionNode;
        this.argumentNodes = argumentNodes;
        this.dispatchNode = FunctionDispatchNodeGen.create();
    }

    @ExplodeLoop
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        CompilerAsserts.compilationConstant(argumentNodes.length);
        Object[] argumentValues = new Object[argumentNodes.length];
        for (int i = 0; i < argumentNodes.length; i++) {
            argumentValues[i] = argumentNodes[i].executeGeneric(frame);
        }
        var func = this.functionNode.executeGeneric(frame);
        return dispatchNode.executeDispatch(func, argumentValues);
    }
}
