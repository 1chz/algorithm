package io.github.shirohoo.algorithm;

import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Programmers72410 {
    public String solution(String new_id) {
        return Stream.of(new_id)
                .map(step1())
                .map(step2())
                .map(step3())
                .map(step4())
                .map(step5())
                .map(step6())
                .map(step7())
                .collect(joining());
    }

    private Function<String, String> step1() {
        return String::toLowerCase;
    }

    private Function<String, String> step2() {
        return s -> s.replaceAll("[^-_.a-z0-9]", "");
    }

    private Function<String, String> step3() {
        return s -> s.replaceAll("[.]+", ".");
    }

    private Function<String, String> step4() {
        return s -> s.replaceAll("^[.]|[.]$", "");
    }

    private Function<String, String> step5() {
        return s -> !s.isBlank() ? s : "a";
    }

    private Function<String, String> step6() {
        return s -> s.length() < 16 ? s : s.substring(0, 15).replaceAll("^[.]|[.]$", "");
    }

    private Function<String, String> step7() {
        return s -> s.length() >= 3 ? s : s + String.valueOf(s.charAt(s.length() - 1)).repeat(3 - s.length());
    }
}
