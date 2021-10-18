package practice.array;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>6. 뒤집은 소수</h1>
 * <h1>설명</h1>
 * <p>
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * <p>
 * 첫 자리부터의 연속된 0은 무시한다.
 *
 * <h1>입력</h1>
 * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 * <p>
 * 각 자연수의 크기는 100,000를 넘지 않는다.
 *
 * <h1>출력</h1>
 * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 */
@DisplayName("배열 - 에라토스테네스 체")
public class ReversePrimeNumberTest {

    private ReversePrimeNumber solve = new ReversePrimeNumber();

    @MethodSource
    @ParameterizedTest
    void solution(final String testCase, final String expected) throws Exception {
        final String actual = solve.solution(testCase);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of("32 55 62 20 250 370 200 30 100", "23 2 73 2 3")
        );
    }

}
