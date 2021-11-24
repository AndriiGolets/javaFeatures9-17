package site.golets.java9;

public interface InterfacePrivateMethods {

    private static String staticPrivate() {
        return "static private";
    }

    private String instancePrivate() {
        return "instance private";
    }

    default void check() {
        String result = staticPrivate();
        InterfacePrivateMethods pvt = new InterfacePrivateMethods() {
            // anonymous class
        };
        result = pvt.instancePrivate();
    }

}
