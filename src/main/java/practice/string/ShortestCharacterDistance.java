package practice.string;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class ShortestCharacterDistance {

    public String solution(final String charSequence, final char target) {
        int[] indexes = new int[charSequence.length()];

        int initialValue = 101;
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) == target) {
                initialValue = 0;
                indexes[i] = initialValue;
            } else {
                indexes[i] = ++initialValue;
            }
        }

        initialValue = 101;
        for (int i = charSequence.length() - 1; i >= 0; i--) {
            if (charSequence.charAt(i) == target) {
                initialValue = 0;
            } else {
                initialValue++;
                indexes[i] = Math.min(indexes[i], initialValue);
            }
        }

        return stream(indexes)
            .mapToObj(String::valueOf)
            .collect(joining(" "));
    }

}
