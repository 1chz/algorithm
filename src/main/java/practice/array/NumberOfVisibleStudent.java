package practice.array;

import static java.util.Arrays.stream;

public class NumberOfVisibleStudent {

    public int solution(final String testCase) {
        int count = 0;
        int maxHeight = Integer.MIN_VALUE;

        for (int height : heightsFrom(testCase)) {
            if (height > maxHeight) {
                maxHeight = height;
                count++;
            }
        }

        return count;
    }

    private int[] heightsFrom(final String testCase) {
        return stream(testCase.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
    }

}
