package programmers;

import static java.lang.Integer.toBinaryString;
import java.util.stream.IntStream;

public class Programmers17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        return IntStream.range(0, n)
            .mapToObj(i -> String.format("%" + n + "s", toBinaryString((arr1[i] | arr2[i])))
                .replace('0', ' ')
                .replace('1', '#'))
            .toArray(String[]::new);
    }
}
