// Exercise 4

import java.util.stream.IntStream;

public class PerfectNumber {

    public static boolean test(int input) {
        return ((IntStream.range(1, input + 1)
                .filter( i -> input % i == 0)
                .sum()) / 2) == input;
    }

}
