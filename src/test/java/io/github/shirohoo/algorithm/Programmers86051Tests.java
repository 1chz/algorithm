package io.github.shirohoo.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/86051
 */
@DisplayName("프로그래머스 86051 - 없는 숫자 더하기")
class Programmers86051Tests {
    @MethodSource
    @ParameterizedTest
    void solution(int[] numbers, int expected) throws Exception {
        // given
        Programmers86051 sut = new Programmers86051();

        // when
        int actual = sut.solution(numbers);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 6, 7, 8, 0}, 14),
                Arguments.of(new int[]{5, 8, 4, 0, 6, 7, 9}, 6)
        );
    }
}
