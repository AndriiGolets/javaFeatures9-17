package site.golets.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollector {

    public static void main(String[] args) {

        double mean = Stream.of(1, 2, 3, 4, 5)
                // teeing()
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));

    }

}
