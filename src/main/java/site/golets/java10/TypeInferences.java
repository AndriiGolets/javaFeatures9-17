package site.golets.java10;

import java.util.List;

public class TypeInferences {

    public static void main(String[] args) {
        List<String> names1 = List.of("one", "two");
        List<String> names2 = List.of("good", "bad");

        // TypeInferences java 10
        var names = List.of(names1, names2);
        // var sdf = null; - not allowed

        names.forEach(System.out::println);

        var i = List.of("one", "eleven").stream().filter(s -> s.length() < 5);
        i.forEach(System.out::println);

    }

}
