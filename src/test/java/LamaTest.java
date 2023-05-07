import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LamaTest {
    private Context context;

    @BeforeEach
    void setUp() {
        context = Context.create();
    }

    @AfterEach
    void tearDown() {
        context.close();
    }

    @Test
    void simpleArithmeticsTest() {
        Value result = context.eval("lama", "1 + 2");
        assertEquals(3, result.asInt());
    }

    @Test
    void simpleBooleanOperatorsTest_or() {
        Value result1 = context.eval("lama", "0 !! 0");
        assertFalse(result1.asBoolean());

        Value result2 = context.eval("lama", "3 !! 0");
        assertTrue(result2.asBoolean());

        Value result3 = context.eval("lama", "0 !! 1");
        assertTrue(result3.asBoolean());
    }

    @Test
    void simpleBooleanOperatorsTest_and() {
        Value result1 = context.eval("lama", "0 && 1");
        assertFalse(result1.asBoolean());

        Value result2 = context.eval("lama", "3 && 1");
        assertTrue(result2.asBoolean());
    }

    @Test
    void simpleBooleanOperatorsTest_literals() {
        Value result1 = context.eval("lama", "true && true");
        assertTrue(result1.asBoolean());

        Value result2 = context.eval("lama", "false && 1");
        assertFalse(result2.asBoolean());
    }

    @Test
    void stringLiterals() {
        Value result = context.eval("lama", "\"foo\"");
        assertEquals("foo", result.asString());
    }

    @Test
    void simpleVariableDefinitions() {
        Value result1 = context.eval("lama",
                """
                        var a = 1;
                        a
                        """);
        assertEquals(1, result1.asInt());

        Value result2 = context.eval("lama",
                """
                        var a = 1, b = 2;
                        b
                        """);
        assertEquals(2, result2.asInt());

        Value result3 = context.eval("lama",
                """
                        var a = 1, b = 2;
                        b := a;
                        b
                        """);
        assertEquals(1, result3.asInt());

        Value result4 = context.eval("lama",
                """
                        var a = 1, b = 2;
                        var c = 0;
                        c := a + b
                        """);
        assertEquals(1 + 2, result4.asInt());

        Value result5 = context.eval("lama",
                """
                        var a = 1, b = 2;
                        var c = a + b;
                        c
                        """);
        assertEquals(1 + 2, result5.asInt());

        Value result6 = context.eval("lama",
                """
                        var a = 1, b = 2;
                        var c = 3, d = 4;
                        a + b + c + d
                        """);
        assertEquals(1 + 2 + 3 + 4, result6.asInt());
    }

    @Test
    void simpleVariableDefinitionsWithScopes() {
        Value result1 = context.eval("lama",
                """
                        var a = 1;
                        (
                            var a = 2;
                        );
                        a
                        """);
        assertEquals(1, result1.asInt());
    }

    @Test
    void nestedScopes() {
        Value result1 = context.eval("lama",
                """
                        var a = 1;
                        var b = 1;
                        (
                            var a = 2;
                            b := 3;
                            (
                                var b = 42;
                                a := 20
                            )
                        );
                        a + b
                        """);
        assertEquals(4, result1.asInt());
    }

    @Test
    void charLiterals() {
        Value result1 = context.eval("lama", "'1'");
        assertEquals(result1.asInt(), '1');

        Value result2 = context.eval("lama", "'\\n'");
        assertEquals(result2.asInt(), '\n');

        Value result3 = context.eval("lama", "'\\t'");
        assertEquals(result3.asInt(), '\t');

        Value result4 = context.eval("lama", "'\\''");
        assertEquals(result4.asInt(), '\'');

        Value result5 = context.eval("lama", "'1' + 1");
        assertEquals(result5.asInt(), '2');
    }

    @Test
    void implicitWideningCastFromBoolToInt() {
        Value result = context.eval("lama", "1 + true");
        assertEquals(result.asInt(), 2);
    }

    @Test
    void basicIfExpression() {
        var result1 = context.eval("lama", "if 1 == 0 then 42 else 43 fi");
        assertEquals(43, result1.asInt());

        var result2 = context.eval("lama",
                """
                        var a = 1, b = 2;
                        if a < b then
                            var c = 3;
                            a + c
                        else
                            b
                        fi
                        """);
        assertEquals(4, result2.asInt());
    }

    @Test
    void ifExprScopes() {
        var result1 = context.eval("lama",
                """
                        var a = 1, b = 2;
                        if a < b then
                            var c = 3;
                            var b = 5;
                            b := 10;
                            a := c
                        else
                            b
                        fi;
                        a + b
                        """);
        assertEquals(5, result1.asInt());
    }

    @Test
    void elseIf() {
        var result1 = context.eval("lama",
                """
                        var a = 2, b = 2;
                        if a > b then
                            42
                        elif a < b then
                            43
                        elif a == b then
                            a + b
                        else
                            44
                        fi
                        """);
        assertEquals(4, result1.asInt());
    }

    @Test
    void basicWhile() {
        var result1 = context.eval("lama",
                """
                        var a = 0, b = 1;
                        var n = 2;
                        while n < 8 do
                            var c = a + b;
                            a := b;
                            b := c;
                            n := n + 1
                        od;
                        b
                        """);
        assertEquals(13, result1.asInt());
    }

    @Test
    void forLoop() {
        var result1 = context.eval("lama",
                """
                        var a = 0, b = 1;
                        for var n = 2;, n < 8, n := n + 1 do
                            var c = a + b;
                            a := b;
                            b := c
                        od;
                        b
                        """);
        assertEquals(13, result1.asInt());
    }

    @Test
    void doWhileLoop() {
        var result1 = context.eval("lama",
                """
                        var a = 0, b = 1;
                        var n = 2;
                        do
                            var c = a + b;
                            a := b;
                            b := c;
                            n := n + 1
                        while n < 8 od;
                        b
                        """);
        assertEquals(13, result1.asInt());
    }
}
