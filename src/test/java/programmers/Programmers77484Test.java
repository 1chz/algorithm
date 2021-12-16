package programmers;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/77484
 */
@DisplayName("프로그래머스 77484 - 로또의 최고 순위와 최저 순위")
class Programmers77484Test {

    private Programmers77484 solve = new Programmers77484();

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}, new int[]{3, 5}),
            Arguments.of(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25}, new int[]{1, 6}),
            Arguments.of(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35}, new int[]{1, 1})
        );
    }

    @MethodSource
    @ParameterizedTest
    void solution(int[] lottos, int[] winNums, int[] expected) throws Exception {
        int[] actual = solve.solution(lottos, winNums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}
