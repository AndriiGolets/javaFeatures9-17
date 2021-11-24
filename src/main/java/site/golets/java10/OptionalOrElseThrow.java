package site.golets.java10;

import java.util.List;

public class OptionalOrElseThrow {

    public static void main(String[] args) {
        List<Integer> someIntList = List.of(1, 2, 4, 7, 78);
        Integer firstEven = someIntList.stream()
                .filter(i -> i % 2 == 0)
                .findFirst()

                /*
                java.util.Optional, java.util.OptionalDouble, java.util.OptionalIntand java.util.OptionalLongeach
                got a new method orElseThrow() - which doesn't take any argument and throws NoSuchElementExceptionif no value is present:
                 */
                .orElseThrow();

    }

}
