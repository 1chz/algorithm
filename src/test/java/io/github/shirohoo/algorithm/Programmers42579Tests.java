package io.github.shirohoo.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/42579
 */
@DisplayName("프로그래머스 42579 - 베스트앨범")
class Programmers42579Tests {
    @MethodSource
    @ParameterizedTest
    void solution(String[] genres, int[] plays, int[] expected) throws Exception {
        // given
        Programmers42579 sut = new Programmers42579();

        // when
        int[] actual = sut.solution(genres, plays);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(
                        new String[]{"classic", "pop", "classic", "classic", "pop"},
                        new int[]{500, 600, 150, 800, 2500},
                        new int[]{4, 1, 3, 0}
                )
        );
    }
}
