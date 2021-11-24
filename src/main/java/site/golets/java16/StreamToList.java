package site.golets.java16;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamToList {

    public static void main(String[] args) {

        List<String> integersAsString = Arrays.asList("1", "2", "3");
        List<Integer> ints = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());

        // .toList - java 16
        List<Integer> intsEquivalent = integersAsString.stream().map(Integer::parseInt).toList();

    }

}
