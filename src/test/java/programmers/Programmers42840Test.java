package programmers;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <pre>
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/42840?language=java
 *
 * 풀이:
 * 해쉬맵을 사용해 정답개수 = {사람, 사람, 사람} 으로 값을 셋팅한다.
 * 예를들어 1번은 5개를 맞췄고, 2~3번은 0개를 맞췄다면 해쉬맵에는
 * 5 = {1}
 * 0 = {2,3}
 * 같이 데이터를 저장하고 역정렬 후 반환한다.
 *
 * 시간복잡도는 O(N)
 *
 * </pre>
 */
@DisplayName("프로그래머스 42576 - 완주하지 못한 선수")
class Programmers42840Test {

    private Programmers42840 solve = new Programmers42840();

    @MethodSource
    @ParameterizedTest
    void solution(final int[] answers, final int[] expected) {
        final int[] actual = solve.solution(answers);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{1}),
            Arguments.of(new int[]{1, 3, 2, 4, 2}, new int[]{1, 2, 3}),
            Arguments.of(new int[]{1, 3, 2, 4, 2, 1}, new int[]{1})
        );
    }

}
