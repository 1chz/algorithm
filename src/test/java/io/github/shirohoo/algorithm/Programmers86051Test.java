package io.github.shirohoo.algorithm;

import io.github.shirohoo.algorithm.Programmers86051;
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
class Programmers86051Test {
    Programmers86051 solve = new Programmers86051();

    static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 6, 7, 8, 0}, 14),
                Arguments.of(new int[]{5, 8, 4, 0, 6, 7, 9}, 6)
        );
    }

    @MethodSource
    @ParameterizedTest
    void solution(int[] numbers, int expected) throws Exception {
        int actual = solve.solution(numbers);
        assertThat(actual).isEqualTo(expected);
    }
}
