package io.github.shirohoo.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/42578
 */
@DisplayName("프로그래머스 42578 - 위장")
class Programmers42578Tests {
    @MethodSource
    @ParameterizedTest
    void solution(String[][] clothes, int expected) throws Exception {
        // given
        Programmers42578 sut = new Programmers42578();

        // when
        int actual = sut.solution(clothes);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(new String[][]{
                        {"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}
                }, 5),
                Arguments.of(new String[][]{
                        {"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}
                }, 3)
        );
    }
}
