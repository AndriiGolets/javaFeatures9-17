package site.golets.java11;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 4, 5, 67, 68);

   //     Predicate<Integer> eventNumberPredicate = number -> number % 2 == 0;
     //   numbers.stream().filter(eventNumberPredicate.negate()).forEach(System.out::println);
        numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
    }

    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

}
