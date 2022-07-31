package io.github.shirohoo.algorithm;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import io.github.shirohoo.algorithm.Programmers72410;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Programmers72410Tests {
    private final Programmers72410 solve = new Programmers72410();

    @MethodSource
    @ParameterizedTest
    void solution(String new_id, String expected) throws Exception {
        String result = solve.solution(new_id);
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            arguments("...!@BaT#*..y.abcdefghijklm", "bat.y.abcdefghi"),
            arguments("z-+.^.", "z--"),
            arguments("=.=", "aaa"),
            arguments("123_.def", "123_.def"),
            arguments("abcdefghijklmn.p", "abcdefghijklmn")
        );
    }
}
