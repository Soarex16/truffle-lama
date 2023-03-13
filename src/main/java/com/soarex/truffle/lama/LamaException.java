package com.soarex.truffle.lama;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.exception.AbstractTruffleException;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.source.SourceSection;

import static com.oracle.truffle.api.CompilerDirectives.shouldNotReachHere;

public class LamaException extends AbstractTruffleException {
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
