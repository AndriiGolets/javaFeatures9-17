package site.golets.java10;

import java.util.List;
import java.util.stream.Collectors;

public class ToUnmodifiable {

    public static void main(String[] args) {

        List<Integer> someIntList = List.of(1, 2, 4, 7, 78);
        List<Integer> evenList = someIntList.stream()
                .filter(i -> i % 2 == 0)

                // Any attempt to modify such a collection would result in java.lang.UnsupportedOperationExceptionruntime exception.
                .collect(Collectors.toUnmodifiableList());
        evenList.add(4);

    }

}
