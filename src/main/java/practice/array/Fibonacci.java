package practice.array;

import static java.util.Arrays.stream;
import java.util.stream.Collectors;

public class Fibonacci {

    public String solution(final int value) {
        int[] values = new int[value];
        values[0] = 1;
        values[1] = 1;

        for (int i = 2; i < values.length; i++) {
            values[i] = values[i - 1] + values[i - 2];
        }

        return stream(values)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "));
    }

}
