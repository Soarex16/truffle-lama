import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.junit.jupiter.api.*;

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
        assertEquals(result.asString(), "foo");
    }

    @Test
    void definitions() {
        Value result = context.eval("lama",
                """
                        var a = 1, b = 2;
                        var c = 3, d = 4;
                        a + b + c + d
                        """);
        assertEquals(result.asInt(), 1 + 2 + 3 + 4);
    }

    @Test
    void charLiterals() {
        Value result1 = context.eval("lama", "'1'");
        assertEquals('1', result1.asInt());

        Value result2 = context.eval("lama", "'\\n'");
        assertEquals('\n', result2.asInt());

        Value result3 = context.eval("lama", "'\\t'");
        assertEquals('\t', result3.asInt());

        Value result4 = context.eval("lama", "'\\''");
        assertEquals('\'', result4.asInt());

        Value result5 = context.eval("lama", "'1' + 1");
        assertEquals('2', result5.asInt());
    }
}
