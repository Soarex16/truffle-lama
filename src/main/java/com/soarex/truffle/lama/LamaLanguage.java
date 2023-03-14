package com.soarex.truffle.lama;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.TruffleLanguage;
import com.soarex.truffle.lama.nodes.LamaRootNode;
import com.soarex.truffle.lama.parser.LamaTruffleParser;

@TruffleLanguage.Registration(
    id = LamaLanguage.ID,
    name = LamaLanguage.NAME,
    defaultMimeType = LamaLanguage.MIME_TYPE,
    characterMimeTypes = { LamaLanguage.MIME_TYPE }
)
public class LamaLanguage extends TruffleLanguage<Void> {
    public static final String ID = "lama";
    public static final String NAME = "Lama";
    public static final String MIME_TYPE = "application/x-lama";

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        var code = request.getSource().getReader();
        var root = new LamaRootNode(this, LamaTruffleParser.parse(code));
        return root.getCallTarget();
    }

    @Override
    protected Void createContext(Env env) {
        return null;
    }
}
