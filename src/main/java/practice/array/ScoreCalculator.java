package practice.array;

import static java.util.Arrays.stream;

public class ScoreCalculator {

    public int solution(final String testCase) {
        int answer = 0;

        int[] ints = stream(testCase.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

        int count = 0;
        for (int anInt : ints) {
            if (anInt == 1) {
                answer += ++count;
                continue;
            }
            count = 0;
        }

        return answer;
    }

}
