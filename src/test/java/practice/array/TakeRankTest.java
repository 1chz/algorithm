package practice.array;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>8. 등수구하기</h1>
 * <h1>설명</h1>
 * <p>
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * <p>
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * <p>
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 *
 * <h1>입력</h1>
 * 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
 *
 * <h1>출력</h1>
 * 입력된 순서대로 등수를 출력한다.
 */
@DisplayName("배열 - 등수 구하기")
public class TakeRankTest {

    private TakeRank solve = new TakeRank();

    @MethodSource
    @ParameterizedTest
    void solution(final String testCase, final String expected) throws Exception {
        final String actual = solve.solution(testCase);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of("87 89 92 100 76", "4 3 2 1 5"),
            Arguments.of("99 99 99 98 93 93 43", "1 1 1 4 5 5 7")
        );
    }

}
