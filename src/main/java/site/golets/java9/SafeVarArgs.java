package site.golets.java9;

import java.util.List;
import java.util.ArrayList;

public class SafeVarArgs {

    public static <T> T[] unsafe(T... elements) {
        return elements; // unsafe! don't ever return a parameterized varargs array
    }

    public static <T> T[] broken(T seed) {
        T[] plant = unsafe(seed, seed, seed); // broken! This will be an Object[] no matter what T is
        return plant;
    }

    public static void plant() {
        String[] plants = broken("seed"); // ClassCastException
    }

    /**
     * @SafeVarargs is like @SupressWarnings in that it allows us to declare that a particular
     * compiler warning is a false positive. Once we ensure our actions are safe, we can add this annotation:
     * */
    public class Machine<T> {
        private List<T> versions = new ArrayList<>();

        @SafeVarargs
        public final void safe(T... toAdd) {
            for (T version : toAdd) {
                versions.add(version);
            }
        }
    }

}
