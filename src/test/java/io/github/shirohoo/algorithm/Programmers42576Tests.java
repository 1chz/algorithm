package io.github.shirohoo.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <pre>
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
 *
 * 풀이:
 * 완주한 사람의 수는 참가자 수보다 항상 1만큼 작으므로, 완주하지 못한 사람은 반드시 1명입니다,
 * 따라서 참가자와 완주자 배열을 정렬하고 참가자 배열을 순회하며 완주자 배열과 비교하다 이름이 다른 사람을 발견 할 경우 바로 그 사람이 완주하지 못한 사람입니다.
 *
 * 풀이의 시간복잡도는 참가자 배열을 한번 순회하면 끝나므로 O(n)입니다.
 * </pre>
 */
@DisplayName("프로그래머스 42576 - 완주하지 못한 선수")
class Programmers42576Tests {
    @MethodSource
    @ParameterizedTest
    void solution(String[] participant, String[] completion, String expected) {
        // given
        Programmers42576 sut = new Programmers42576();

        // when
        String actual = sut.solution(participant, completion);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(
                        new String[]{"leo", "kiki", "eden"},
                        new String[]{"eden", "kiki"},
                        "leo"
                ),
                Arguments.of(
                        new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                        new String[]{"josipa", "filipa", "marina", "nikola"},
                        "vinko"
                ),
                Arguments.of(
                        new String[]{"mislav", "stanko", "mislav", "ana"},
                        new String[]{"stanko", "ana", "mislav"},
                        "mislav"
                )
        );
    }
}