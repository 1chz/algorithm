package practice.string;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import practice.string.FindChars;

/**
 * <pre>
 * <h1>1. 문자 찾기</h1>
 *  
 * <h1>설명</h1>
 *
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 *
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 *
 * <h1>입력</h1>
 * 
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 *
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 * <h1>출력</h1>
 * 
 * 첫 줄에 해당 문자의 개수를 출력한다.
 * </pre>
 */
@DisplayName("문자열 - 문자 찾기")
class FindCharsTest {

    private FindChars solve = new FindChars();

    @MethodSource
    @ParameterizedTest
    void solution(final String charSequence, final char c, final int expected) {
        final int actual = solve.solution(charSequence, c);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.arguments("Computercooler", 'c', 2),
            Arguments.arguments("Macbook Air", 'a', 2),
            Arguments.arguments("Java Spring", 'i', 1)
        );
    }

}