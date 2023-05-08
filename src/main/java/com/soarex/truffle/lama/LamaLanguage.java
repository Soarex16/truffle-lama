package com.soarex.truffle.lama;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.strings.TruffleString;
import com.soarex.truffle.lama.nodes.LamaRootNode;
import com.soarex.truffle.lama.parser.LamaTruffleParser;
import com.soarex.truffle.lama.runtime.GlobalScope;

@TruffleLanguage.Registration(
        id = LamaLanguage.ID,
        name = LamaLanguage.NAME,
        defaultMimeType = LamaLanguage.MIME_TYPE,
        characterMimeTypes = {LamaLanguage.MIME_TYPE}
)
public final class LamaLanguage extends TruffleLanguage<LamaLanguageContext> {
    private static final LanguageReference<LamaLanguage> REFERENCE =
            LanguageReference.create(LamaLanguage.class);
    public static final String ID = "lama";
    public static final String NAME = "Lama";
    public static final String MIME_TYPE = "application/x-lama";

    public static final TruffleString.Encoding STRING_ENCODING = TruffleString.Encoding.UTF_16;

    public static LamaLanguage get(Node node) {
        return REFERENCE.get(node);
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        var code = request.getSource().getReader();
        var parser = new LamaTruffleParser(this);
        var parseResult = parser.parse(code);
        var root = new LamaRootNode(this, parseResult.expr());
        return root.getCallTarget();
    }

    @Override
    protected LamaLanguageContext createContext(Env env) {
        return new LamaLanguageContext(env);
    }

    public static NodeInfo lookupNodeInfo(Class<?> clazz) {
        if (clazz == null) {
            return null;
        }
        NodeInfo info = clazz.getAnnotation(NodeInfo.class);
        if (info != null) {
            return info;
        } else {
            return lookupNodeInfo(clazz.getSuperclass());
        }
    }
}
