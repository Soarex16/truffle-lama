package com.soarex.truffle.lama;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.exception.AbstractTruffleException;
import com.oracle.truffle.api.nodes.Node;

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
        // TODO
        return new LamaException(operation, "");
    }
}
