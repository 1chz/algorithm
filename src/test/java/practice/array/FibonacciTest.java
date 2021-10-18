package practice.array;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>4. 피보나치 수열</h1>
 * <h1>설명</h1>
 * <p>
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * <p>
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 *
 * <h1>입력</h1>
 * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 *
 * <h1>출력</h1>
 * 첫 줄에 피보나치 수열을 출력합니다.
 */
@DisplayName("배열 - 피보나치 수열")
public class FibonacciTest {

    private Fibonacci solve = new Fibonacci();

    @MethodSource
    @ParameterizedTest
    void solution(final int value, final String expected) throws Exception {
        final String actual = solve.solution(value);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(10, "1 1 2 3 5 8 13 21 34 55")
        );
    }

}
