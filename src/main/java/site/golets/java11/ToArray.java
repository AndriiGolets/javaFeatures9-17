package site.golets.java11;

import java.util.Arrays;
import java.util.List;

public class ToArray {

    public static void main(String[] args) {

        List<String> sampleList = Arrays.asList("Java", "Kotlin");

        // The java.util.Collection interface contains a new default toArray method which takes an IntFunction argument.
        String[] sampleArray = sampleList.toArray(String[]::new);

        Arrays.stream(sampleArray).forEach(System.out::println);

    }

}
