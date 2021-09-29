package practice.string;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {

    public String solution(final String charSequence) {
        final LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();

        for (char c : charSequence.toCharArray()) {
            linkedHashSet.add(c);
        }

        return linkedHashSet.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
    }

    public String solution2(final String charSequence) {
        String answer = "";

        for (int order = 0; order < charSequence.length(); order++) {
            char charAt = charSequence.charAt(order);
            int index = charSequence.indexOf(charAt);
            if (order != index) {
                continue;
            } else {
                answer += charAt;
            }
        }

        return answer;
    }

}
