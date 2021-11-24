package site.golets.java11;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class NestBasedAccessControl {

    /**
     * Java 11 introduces the notion of nestmates and the associated access rules within the JVM.
     *
     * A nest of classes in Java implies both the outer/main class and all its nested classes:
     * */

    public static void main(String[] args) {
         // isNestmateOf()
        assert NestBasedAccessControl.class.isNestmateOf(NestBasedAccessControl.NestedClass.class);

        // getNestMembers()
        Set<String> nestedMembers = Arrays.stream(NestBasedAccessControl.NestedClass.class.getNestMembers())
                .map(Class::getName)
                .collect(Collectors.toSet());
    }

    static class NestedClass {}

}
