package practice.array;

import static java.util.Arrays.stream;

public class LargeNumberOutput {

    public String solution(final int numCount, final String testCase) {
        String answer = "";

        int[] nums = stream(testCase.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                answer = append(answer, nums[i]);
            } else if (nums[i] > temp) {
                answer = append(answer, nums[i]);
            }
            temp = nums[i];
        }

        return answer.trim();
    }

    private String append(String answer, final int num) {
        return answer + num + " ";
    }

}
