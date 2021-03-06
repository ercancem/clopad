import clojure.lang.IFn;
import clojure.lang.Keyword;
import clojure.lang.Symbol;
import clojure.lang.Var;

public class Clojure {
    public static final Keyword doc;
    public static final Symbol ns;
    public static final Var printLength;

    public static final IFn nsInterns;
    public static final IFn sourceFn;

    static {
        IFn require = Var.find(Symbol.create("clojure.core", "require"));
        require.invoke(Symbol.create("clojure.repl"));

        doc = Keyword.intern("doc");
        ns = Symbol.create(null, "ns");
        printLength = Var.find(Symbol.create("clojure.core", "*print-length*"));

        nsInterns = Var.find(Symbol.create("clojure.core", "ns-interns"));
        sourceFn = Var.find(Symbol.create("clojure.repl", "source-fn"));
    }
}
