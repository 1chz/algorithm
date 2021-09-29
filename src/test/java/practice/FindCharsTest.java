package practice;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <pre>
 *     문자열에 존재하는 특정 알파벳의 개수를 반환
 *     대소문자를 구분하지 않는다.
 * </pre>
 */
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