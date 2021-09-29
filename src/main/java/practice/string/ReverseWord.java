package practice.string;

import static java.util.Arrays.stream;
import java.util.ArrayList;
import java.util.List;

public class ReverseWord {

    public String[] solution(final String[] words) {
        return stream(words)
            .map(StringBuilder::new)
            .map(StringBuilder::reverse)
            .map(StringBuilder::toString)
            .toArray(String[]::new);
    }

    public String[] solution2(final String[] words) {
        List<String> answer = new ArrayList<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            int lt = 0;
            int rt = chars.length - 1;
            while (lt < rt) {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(chars));
        }

        return answer.toArray(new String[answer.size()]);
    }

}
