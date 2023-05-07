package com.soarex.truffle.lama.nodes.functions.builtins;

import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.strings.TruffleString;
import com.soarex.truffle.lama.LamaException;
import com.soarex.truffle.lama.LamaLanguage;
import com.soarex.truffle.lama.nodes.LamaNode;
import com.soarex.truffle.lama.nodes.functions.FunctionRootNode;
import com.soarex.truffle.lama.nodes.variables.ReadArgumentNode;
import com.soarex.truffle.lama.runtime.FunctionObject;

@NodeChild(value = "arg", type = ReadArgumentNode.class)
public abstract class AbsFunctionNode extends LamaNode {

    public static TruffleString name = TruffleString.fromJavaStringUncached("abs", TruffleString.Encoding.UTF_8);

    public static BuiltinFunctionNode create(LamaLanguage lamaLanguage) {
        var arg = new ReadArgumentNode(0);
        var func = new FunctionRootNode(lamaLanguage, AbsFunctionNodeGen.create(arg));
        var obj = new FunctionObject(func.getCallTarget());
        return new BuiltinFunctionNode(obj);
    }

    @SuppressWarnings("unused")
    @Specialization(rewriteOn = ArithmeticException.class)
    protected int intAbs(int arg) {
        return arg < 0 ? Math.negateExact(arg) : arg;
    }

    @SuppressWarnings("unused")
    @Fallback
    protected Object nonNumberAbs(Object arg) {
        throw LamaException.typeError(this, arg);
    }
}
