package practice.string;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>6. 중복문자제거</h1>
 * <h1>설명</h1>
 * <p>
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * <p>
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 * <h1>입력</h1>
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 *
 * <h1>출력</h1>
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 */
@DisplayName("문자열 - 중복문자제거")
class RemoveDuplicateCharactersTest {

    private RemoveDuplicateCharacters solve = new RemoveDuplicateCharacters();

    @MethodSource
    @ParameterizedTest
    void solution(final String charSequence, final String expected) {
        final String actual = solve.solution(charSequence);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @MethodSource("solution")
    @ParameterizedTest
    void solution2(final String charSequence, final String expected) {
        final String actual = solve.solution2(charSequence);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.arguments("ksekkset", "kset"),
            Arguments.arguments("asfbaddasd", "asfbd"),
            Arguments.arguments("qekjgoqeg", "qekjgo")
        );
    }

}