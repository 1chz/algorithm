package io.github.shirohoo.algorithm;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/81301
 */
@DisplayName("프로그래머스 81301 - 숫자 문자열과 영단어")
class Programmers81301Tests {
    @MethodSource
    @ParameterizedTest
    void solution(String question, int expected) throws Exception {
        // given
        Programmers81301 sut = new Programmers81301();

        // when
        int actual = sut.solution(question);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of("one4seveneight", 1478),
                Arguments.of("23four5six7", 234567),
                Arguments.of("2three45sixseven", 234567),
                Arguments.of("123", 123)
        );
    }
}
