import org.graalvm.polyglot.Context
import org.junit.jupiter.api.Test

class LamaTest {

    @Test
    fun test() {
        val context = Context.create()
        context.eval("sl", "")
    }
}
