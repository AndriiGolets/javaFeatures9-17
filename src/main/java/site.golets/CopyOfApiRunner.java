package site.golets;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

    public static void main(String[] args) {

        //  List<String> names = List.of("" ..)  - will return immutable collection
        List<String> names = new ArrayList<>() {{
            add("one");
            add("two");
            add("three");
        }};

        // return ImmutableCollection
        List<String> copyOfNames = List.copyOf(names);
        doNotChange(copyOfNames);
        System.out.println(names);
    }

    private static void doNotChange(List<String> names) {
        names.add("ShouldNotbeAllowed");

    }

}
