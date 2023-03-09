import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.TruffleLanguage.Registration
import com.oracle.truffle.api.instrumentation.ProvidedTags
import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Source
import java.io.File

class LamaContext(
//    val language: LamaLanguage,
//    val env: TruffleLanguage.Env,
//    val externalBuiltins: List<NodeFactory<*>>
)

@Registration(
    id = LamaLanguage.ID,
    name = "Lama",
    defaultMimeType = LamaLanguage.MIME_TYPE,
    characterMimeTypes = [LamaLanguage.MIME_TYPE],
)
@ProvidedTags
class LamaLanguage : TruffleLanguage<LamaContext>() {
    override fun createContext(env: Env?): LamaContext = LamaContext()

    companion object {
        const val ID = "lama"
        const val MIME_TYPE = "application/x-sl"
    }
}

fun main(args: Array<String>) {
    if (args.isEmpty()) {
//        print("Enter file path: ")
//        val path = File(readln())
        val path = File("tmp.lama")
        val source = Source.newBuilder(LamaLanguage.ID, path).build()
        Context.newBuilder(LamaLanguage.ID).`in`(System.`in`).out(System.out).build().use { context ->
            println("== Running on ${context.engine}")
            context.eval(source)
        }
    } else {
        error("Not empty args")
    }
}
