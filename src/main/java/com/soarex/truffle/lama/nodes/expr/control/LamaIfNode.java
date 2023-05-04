package com.soarex.truffle.lama.nodes.expr.control;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.profiles.ConditionProfile;
import com.soarex.truffle.lama.nodes.LamaNode;

@SuppressWarnings("FieldMayBeFinal")
@NodeInfo(shortName = "if")
//@NodeChild("cond")
//@NodeChild("then")
//@NodeChild("else")
public final class LamaIfNode extends LamaNode {
    @Child
    private LamaNode condExpr;
    @Child
    private LamaNode thenExpr;
    @Child
    private LamaNode elseExpr;

    private final ConditionProfile condProfile = ConditionProfile.createCountingProfile();

    public LamaIfNode(LamaNode condExpr, LamaNode thenExpr, LamaNode elseExpr) {
        this.condExpr = condExpr;
        this.thenExpr = thenExpr;
        this.elseExpr = elseExpr;
    }

    public int executeInt(VirtualFrame frame) throws UnexpectedResultException {
        return condExpr.executeInt(frame) != 0
                ? thenExpr.executeInt(frame)
                : elseExpr.executeInt(frame);
//        return condProfile.profile(condExpr.executeInt(frame) != 0)
//                ? thenExpr.executeInt(frame)
//                : elseExpr == null ? throw new LamaException() : elseExpr.executeInt(frame);
//        throw new IllegalStateException("");
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        try {
            return executeInt(frame);
        } catch (UnexpectedResultException e) {
            throw new RuntimeException(e);
        }
    }
}
