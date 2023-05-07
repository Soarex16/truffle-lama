package com.soarex.truffle.lama;

import com.oracle.truffle.api.strings.TruffleString;

public final class Utils {
    private Utils() {
    }

    public static TruffleString asTruffleString(String text) {
        return TruffleString.fromJavaStringUncached(text, LamaLanguage.STRING_ENCODING);
    }
}
