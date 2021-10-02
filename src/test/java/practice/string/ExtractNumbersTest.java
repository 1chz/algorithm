package practice.string;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>9. 숫자만 추출</h1>
 * <h1>설명</h1>
 * <p>
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * <p>
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 * <p>
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *
 * <h1>입력</h1>
 * 첫 줄에 숫자가 썩인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * <h1>출력</h1>
 * 첫 줄에 자연수를 출력합니다.
 */
@DisplayName("문자열 - 숫자만 추출")
class ExtractNumbersTest {

    private ExtractNumbers solve = new ExtractNumbers();

    @MethodSource
    @ParameterizedTest
    void solution(final String charSequence, final int expected) {
        final int actual = solve.solution(charSequence);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.arguments("g0en2T0s8eSoft", 208),
            Arguments.arguments("tge0a1h205er", 1205)
        );
    }

}