package io.github.shirohoo.algorithm;

import static org.assertj.core.api.Assertions.assertThat;
import io.github.shirohoo.algorithm.Programmers42579;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/42579
 */
@DisplayName("프로그래머스 42579 - 베스트앨범")
class Programmers42579Test {
    Programmers42579 solve = new Programmers42579();

    static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(
                new String[]{"classic", "pop", "classic", "classic", "pop"},
                new int[]{500, 600, 150, 800, 2500},
                new int[]{4, 1, 3, 0}
            )
        );
    }

    @MethodSource
    @ParameterizedTest
    void solution(String[] genres, int[] plays, int[] expected) throws Exception {
        int[] actual = solve.solution(genres, plays);
        assertThat(actual).isEqualTo(expected);
    }
}
