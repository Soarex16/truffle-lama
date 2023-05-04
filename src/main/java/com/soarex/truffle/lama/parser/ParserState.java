package com.soarex.truffle.lama.parser;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.strings.TruffleString;

import java.util.*;

public final class ParserState {
    private final Deque<Map<TruffleString, FrameMember>> scopes = new ArrayDeque<>();
    private FrameDescriptor.Builder frameBuilder;

    public void enterScope() {
        scopes.push(new HashMap<>());
    }

    public void leaveScope() {
        scopes.pop();
    }

    public void enterFunction() {
        assert frameBuilder == null;
        frameBuilder = FrameDescriptor.newBuilder();
    }

    public FrameDescriptor leaveFunction() {
        FrameDescriptor frame = frameBuilder.build();
        frameBuilder = null;
        return frame;
    }

    public FrameMember.LocalVariable declareVariable(TruffleString name) {
        int slotId = this.frameBuilder.addSlot(FrameSlotKind.Illegal, name, null);
        var variable = new FrameMember.LocalVariable(slotId);
        Objects.requireNonNull(scopes.peek()).put(name, variable);
        return variable;
    }

    public void declareFunctionParams(List<TruffleString> paramNames) {
        for (int i = 0; i < paramNames.size(); i++) {
            var param = new FrameMember.FunctionParameter(i);
            Objects.requireNonNull(scopes.peek()).put(paramNames.get(i), param);
        }
    }

    public FrameMember lookup(TruffleString name) {
        for (var scope : scopes) {
            var member = scope.get(name);
            if (member != null) {
                return member;
            }
        }

        return null;
    }
}
