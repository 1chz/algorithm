package practice.array;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>10. 봉우리</h1>
 * <h1>설명</h1>
 * <p>
 * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
 * <p>
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
 * <p>
 * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
 * <p>
 * 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
 *
 * <h1>입력</h1>
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * <p>
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 *
 * <h1>출력</h1>
 * 봉우리의 개수를 출력하세요.
 */
@DisplayName("배열 - 봉우리")
public class PeakTest {

    private Peak solve = new Peak();

    @MethodSource
    @ParameterizedTest
    void solution(final int n, final int[][] arr, final int expected) throws Exception {
        final int actual = solve.solution(n, arr);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(
                5, new int[][]{
                    {5, 3, 7, 2, 3},
                    {3, 7, 1, 6, 1},
                    {7, 2, 5, 3, 4},
                    {4, 3, 6, 4, 1},
                    {8, 7, 3, 5, 2}
                }, 10));
    }

}
