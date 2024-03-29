package com.soarex.truffle.lama.nodes.expr.control;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.profiles.ConditionProfile;
import com.soarex.truffle.lama.LamaTypeSystemGen;
import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.runtime.LamaNull;

@SuppressWarnings("FieldMayBeFinal")
@NodeInfo(shortName = "if")
public final class LamaIfNode extends LamaNode {
    private final ConditionProfile condProfile = ConditionProfile.createCountingProfile();
    @Child
    private LamaNode condExpr;
    @Child
    private LamaNode thenExpr;
    @Child
    private LamaNode elseExpr;

    public LamaIfNode(LamaNode condExpr, LamaNode thenExpr, LamaNode elseExpr) {
        this.condExpr = condExpr;
        this.thenExpr = thenExpr;
        this.elseExpr = elseExpr;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        if (condProfile.profile(LamaTypeSystemGen.asBoolean(condExpr.executeGeneric(frame)))) {
            return thenExpr.executeGeneric(frame);
        } else {
            return elseExpr == null ? LamaNull.INSTANCE : elseExpr.executeGeneric(frame);
        }
    }
}
