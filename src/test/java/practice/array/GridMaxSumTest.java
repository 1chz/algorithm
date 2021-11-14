package practice.array;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>9. 격자판 최대합</h1>
 * <h1>설명</h1>
 * <p>
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * <p>
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 *
 * <h1>입력</h1>
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * <p>
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 *
 * <h1>출력</h1>
 * 최대합을 출력합니다.
 */
@DisplayName("배열 - 격자판 최대합")
public class GridMaxSumTest {

    private GridMaxSum solve = new GridMaxSum();

    @MethodSource
    @ParameterizedTest
    void solution(final int n, final int[][] arr, final int expected) throws Exception {
        final int actual = solve.solution(n, arr);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(
                5,
                new int[][]{
                    {10, 13, 10, 12, 15},
                    {12, 39, 30, 23, 11},
                    {11, 25, 50, 53, 15},
                    {19, 27, 29, 37, 27},
                    {19, 13, 30, 13, 19}
                },
                155)
        );
    }

}
