package io.github.shirohoo.algorithm;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Programmers72410Tests {
    @MethodSource
    @ParameterizedTest
    void solution(String newId, String expected) throws Exception {
        // given
        Programmers72410 sut = new Programmers72410();

        // when
        String actual = sut.solution(newId);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> solution() {
        return Stream.of(
                arguments("...!@BaT#*..y.abcdefghijklm", "bat.y.abcdefghi"),
                arguments("z-+.^.", "z--"),
                arguments("=.=", "aaa"),
                arguments("123_.def", "123_.def"),
                arguments("abcdefghijklmn.p", "abcdefghijklmn")
        );
    }
}
