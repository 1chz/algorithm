package practice.string;

import static java.util.Arrays.stream;

public class ReverseWord {

    public String[] solution(final String[] words) {
        return stream(words)
            .map(StringBuilder::new)
            .map(StringBuilder::reverse)
            .map(StringBuilder::toString)
            .toArray(String[]::new);
    }

}
