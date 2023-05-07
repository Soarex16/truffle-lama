package com.soarex.truffle.lama;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.exception.AbstractTruffleException;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

public final class LamaException extends AbstractTruffleException {
    @TruffleBoundary
    public LamaException(String message) {
        super(message);
    }

    @TruffleBoundary
    public LamaException(Node location, String message) {
        super(message, location);
    }

    @TruffleBoundary
    public static LamaException typeError(Node operation, Object... values) {
        StringBuilder result = new StringBuilder();
        result.append("Type error");

        result.append(": operation");
        if (operation != null) {
            NodeInfo nodeInfo = LamaLanguage.lookupNodeInfo(operation.getClass());
            if (nodeInfo != null) {
                result.append(" \"").append(nodeInfo.shortName()).append("\"");
            }
        }

        result.append(" not defined for values (");
        String sep = "";
        for (Object value : values) {
            result.append(sep);
            result.append(value == null ? null : value.toString());
            sep = ", ";
        }
        result.append(")");
        return new LamaException(operation, result.toString());
    }
}
