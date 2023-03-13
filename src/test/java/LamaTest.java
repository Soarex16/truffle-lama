import com.soarex.truffle.lama.nodes.LamaNumberLiteralNode;
import com.soarex.truffle.lama.nodes.LamaRootNode;
import com.soarex.truffle.lama.nodes.expr.arithmetics.LamaAddNodeGen;
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
    void simpleTest() {
        Value result = context.eval("lama", "1 + 2");
        assertEquals(3, result.asInt());
    }

    @Test
    void addTest() {
        var expr = LamaAddNodeGen.create(
                new LamaNumberLiteralNode(1),
                new LamaNumberLiteralNode(2)
        );
        var root = new LamaRootNode(expr);
        var callTarget = root.getCallTarget();

        var result = callTarget.call();

        assertEquals(3, result);
    }
}
