package practice.string;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>11. 문자열 압축</h1>
 * <h1>설명</h1>
 * <p>
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * <p>
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * <p>
 * 단 반복횟수가 1인 경우 생략합니다.
 *
 * <h1>입력</h1>
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 * <h1>출력</h1>
 * 첫 줄에 압축된 문자열을 출력한다.
 */
@DisplayName("문자열 - 문자열 압축")
class CompressionStringTest {

    private CompressionString solve = new CompressionString();

    @MethodSource
    @ParameterizedTest
    void solution(final String charSequence, final String expected) {
        final String actual = solve.solution(charSequence);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.arguments("KKHSSSSSSSE", "K2HS7E"),
            Arguments.arguments("KSTTTSEEKFKKKDJJGG", "KST3SE2KFK3DJ2G2")
        );
    }

}