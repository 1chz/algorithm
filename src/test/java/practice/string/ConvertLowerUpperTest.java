package practice.string;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <pre>
 * <h1>2. 대소문자 변환</h1>
 * <h1>설명</h1>
 *
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 *
 *
 * <h1>입력</h1>
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * <h1>출력</h1>
 * </pre>
 */
@DisplayName("문자열 - 대소문자 변환")
class ConvertLowerUpperTest {

    private ConvertLowerUpper solve = new ConvertLowerUpper();

    @MethodSource
    @ParameterizedTest
    void solution(final String charSequence, final String expected) {
        final String actual = solve.solution(charSequence);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.arguments("Computercooler", "cOMPUTERCOOLER"),
            Arguments.arguments("Macbook Air", "mACBOOK aIR"),
            Arguments.arguments("Java Spring", "jAVA sPRING")
        );
    }

}