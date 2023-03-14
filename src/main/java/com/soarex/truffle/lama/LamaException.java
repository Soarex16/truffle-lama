package com.soarex.truffle.lama;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.exception.AbstractTruffleException;
import com.oracle.truffle.api.nodes.Node;

public final class LamaException extends AbstractTruffleException {
    @TruffleBoundary
    public LamaException(String message, Node location) {
        super(message, location);
    }

    @TruffleBoundary
    public static LamaException typeError(Node operation, Object... values) {
        // TODO
        return new LamaException("", operation);
    }
}
