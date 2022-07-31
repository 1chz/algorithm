package io.github.shirohoo.algorithm;

import static org.assertj.core.api.Assertions.assertThat;
import io.github.shirohoo.algorithm.Programmers42748;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/42748
 */
@DisplayName("프로그래머스 42748 - K번째 수")
class Programmers42748Test {
    Programmers42748 solve = new Programmers42748();

    static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(
                new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}},
                new int[]{5, 6, 3}
            )
        );
    }

    @MethodSource
    @ParameterizedTest
    void solution(int[] array, int[][] commands, int[] expected) throws Exception {
        int[] actual = solve.solution(array, commands);
        assertThat(actual).isEqualTo(expected);
    }
}
