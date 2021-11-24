package site.golets.java9;

public class ModularSystem {

    /**
     * A modular system provides capabilities similar to OSGi framework's system.
     * Modules have a concept of dependencies, can export a public API and keep implementation details hidden/private.
     *
     * One of the main motivations here is to provide modular JVM,
     * which can run on devices with a lot less available memory.
     * The JVM could run with only those modules and APIs which are required by the application.
     *
     * module com.baeldung.java9.modules.car {
     *     requires com.baeldung.java9.modules.engines;
     *     exports com.baeldung.java9.modules.car.handling;
     * }
     * */

}
