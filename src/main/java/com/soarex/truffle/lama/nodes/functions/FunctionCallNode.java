package com.soarex.truffle.lama.nodes.functions;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.soarex.truffle.lama.nodes.LamaNode;

import java.util.List;

@NodeInfo(shortName = "call")
public class FunctionCallNode extends LamaNode {
    @Children
    private final LamaNode[] argumentNodes;
    @SuppressWarnings("FieldMayBeFinal")
    @Child
    private LamaNode functionNode;

//    @SuppressWarnings("FieldMayBeFinal")
//    @Child
//    private LamaNode functionNode;


    public FunctionCallNode(LamaNode functionNode, List<LamaNode> argumentNodes) {
        this.functionNode = functionNode;
        this.argumentNodes = argumentNodes.toArray(new LamaNode[0]);
    }

    @ExplodeLoop
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        CompilerAsserts.compilationConstant(argumentNodes.length);
        Object[] argumentValues = new Object[argumentNodes.length];
        for (int i = 0; i < argumentNodes.length; i++) {
            argumentValues[i] = argumentNodes[i].executeGeneric(frame);
        }

        Object function = functionNode.executeGeneric(frame);

        return null;
    }
}
