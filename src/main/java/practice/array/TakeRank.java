package practice.array;

import static java.util.Arrays.stream;
import java.util.stream.Collectors;

public class TakeRank {

    public String solution(final String testCase) {
        int[] cases = stream(testCase.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

        int[] answer = new int[cases.length];

        for (int i = 0; i < cases.length; i++) {
            int rank = 1;
            for (int j = 0; j < cases.length; j++) {
                if (cases[i] < cases[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return stream(answer)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "));
    }

}
