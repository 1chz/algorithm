package practice.string;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>7. 회문 문자열</h1>
 * <h1>설명</h1>
 * <p>
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * <p>
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * <p>
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 *
 * <h1>입력</h1>
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 * <h1>출력</h1>
 * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 */
@DisplayName("문자열 - 회문 문자열 (=팰린드롬)")
class PalindromeTest {

    private Palindrome solve = new Palindrome();

    @ParameterizedTest
    @MethodSource("solution")
    @DisplayName("문자열을 뒤집은 후 상호 비교. 시간복잡도 O(n)")
    void solution(final String sentence, final boolean expected) {
        final boolean actual = solve.solution(sentence);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("solution")
    @DisplayName("배열 인덱스를 사용한 대칭비교. 시간복잡도는 0.5n이므로 O(n)")
    void solution2(final String sentence, final boolean expected) {
        final boolean actual = solve.solution2(sentence);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of("gooG", true),
            Arguments.of("abba", true),
            Arguments.of("abbs", false)
        );
    }

}