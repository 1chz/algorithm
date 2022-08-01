package io.github.shirohoo.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/64061
 */
@DisplayName("프로그래머스 64061 - 크레인 인형뽑기 게임")
class Programmers64061Tests {
    @MethodSource
    @ParameterizedTest
    void solution(int[][] board, int[] moves, int expected) throws Exception {
        // given
        Programmers64061 sut = new Programmers64061();

        // when
        int actual = sut.solution(board, moves);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 3},
                        {0, 2, 5, 0, 1},
                        {4, 2, 4, 4, 2},
                        {3, 5, 1, 3, 1}
                }, new int[]{1, 5, 3, 5, 1, 2, 1, 4}, 4));
    }
}
