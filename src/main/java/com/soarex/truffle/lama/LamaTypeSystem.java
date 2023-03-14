package com.soarex.truffle.lama;

import com.oracle.truffle.api.dsl.ImplicitCast;
import com.oracle.truffle.api.dsl.TypeSystem;

@TypeSystem({int.class, boolean.class})
public class LamaTypeSystem {
    @ImplicitCast
    public static boolean castIntToBoolean(int value) {
        return value != 0;
    }

    @ImplicitCast
    public static int castBooleanToInt(boolean value) {
        return value ? 1 : 0;
    }
}
