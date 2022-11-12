package Stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamExampleThird {
    public static void main(String[] args) {
//        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Optional<Integer> sum = numbers.reduce((x, y) -> x + y);
//        sum.ifPresent(s -> System.out.println("sum: " + s));

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = numbers.reduce(10, (total, n) -> total + n);
        System.out.println("sum: " + sum);
    }
}
