package io.github.shirohoo.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/92334
 */
@DisplayName("프로그래머스 92334 - 신고 결과 받기")
class Programmers92334Tests {
    @MethodSource
    @ParameterizedTest
    void solution(String[] idList, String[] reports, int k, int[] expected) throws Exception {
        // given
        Programmers92334 sut = new Programmers92334();

        // when
        int[] actual = sut.solution(idList, reports, k);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(
                        new String[]{"muzi", "frodo", "apeach", "neo"},
                        new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
                        2,
                        new int[]{2, 1, 1, 0}
                ),
                Arguments.of(
                        new String[]{"con", "ryan"},
                        new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},
                        3,
                        new int[]{0, 0}
                )
        );
    }
}
