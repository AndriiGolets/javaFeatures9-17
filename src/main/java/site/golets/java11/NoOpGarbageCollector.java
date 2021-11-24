package site.golets.java11;

public class NoOpGarbageCollector {

    /**
     * A new garbage collector called Epsilon is available for use in Java 11 as an experimental feature.
     *
     * It's called a No-Op (no operations) because it allocates memory but does not actually collect any garbage. Thus, Epsilon is applicable for simulating out of memory errors.
     *
     * Obviously Epsilon won't be suitable for a typical production Java application; however, there are a few specific use-cases where it could be useful:
     *
     * Performance testing
     * Memory pressure testing
     * VM interface testing and
     * Extremely short-lived jobs
     * In order to enable it, use the -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC flag.
     * */

}
