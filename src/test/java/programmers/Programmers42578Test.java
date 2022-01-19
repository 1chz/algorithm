package programmers;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/42578
 */
@DisplayName("프로그래머스 42578 - 위장")
class Programmers42578Test {
    Programmers42578 solve = new Programmers42578();

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

    @MethodSource
    @ParameterizedTest
    void solution(String[][] clothes, int expected) throws Exception {
        int actual = solve.solution(clothes);
        assertThat(actual).isEqualTo(expected);
    }
}
