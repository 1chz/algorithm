package programmers;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programmers72410 {
    public String solution(String new_id) {
        return Stream.of(new_id.toLowerCase())
            .map(s -> s.replaceAll("[^-_.a-z0-9]", ""))
            .map(s -> s.replaceAll("[.]{2,}", "."))
            .map(s -> s.replaceAll("^[.]|[.]$", ""))
            .map(s -> s.isBlank() ? "a" : s)
            .map(s -> s.length() >= 16 ? s.substring(0, 15).replaceAll("^[.]|[.]$", "") : s)
            .map(s -> s.length() < 3 ? s + String.valueOf(s.charAt(s.length() - 1)).repeat(3 - s.length()) : s)
            .collect(Collectors.joining());
    }
}
