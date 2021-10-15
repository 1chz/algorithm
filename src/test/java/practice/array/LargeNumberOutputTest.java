package practice.array;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>1. 큰 수 출력하기</h1>
 * <h1>설명</h1>
 * <p>
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * <p>
 * (첫 번째 수는 무조건 출력한다)
 *
 * <h1>입력</h1>
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 *
 * <h1>출력</h1>
 */
@DisplayName("배열 - 큰 수 출력하기")
public class LargeNumberOutputTest {

    private LargeNumberOutput solve = new LargeNumberOutput();

    @MethodSource
    @ParameterizedTest
    void solution(final int numCount, final String testCase, final String expected) throws Exception {
        final String actual = solve.solution(numCount, testCase);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(6, "7 3 9 5 6 12", "7 9 6 12")
        );
    }

}
