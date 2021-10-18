package practice.array;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>5. 소수(에라토스테네스 체)</h1>
 * <h1>설명</h1>
 * <p>
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 *
 * <h1>입력</h1>
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 *
 * <h1>출력</h1>
 * 첫 줄에 소수의 개수를 출력합니다.
 */
@DisplayName("배열 - 에라토스테네스 체")
public class SieveOfEratosthenesTest {

    private SieveOfEratosthenes solve = new SieveOfEratosthenes();

    @MethodSource
    @ParameterizedTest
    void solution(final long value, final long expected) throws Exception {
        final long actual = solve.solution(value);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(20, 8)
        );
    }

}
