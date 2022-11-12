package Stream;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExampleFourth {
    public static void main(String[] args) {
        Set<Integer> evenNumber = IntStream.range(1, 1000).boxed()
                .filter(n -> (n%2 == 0))
                .collect(Collectors.toSet());

        System.out.println(evenNumber);
    }
}
