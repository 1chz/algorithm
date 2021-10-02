package practice.string;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>8. 유효한 팰린드롬</h1>
 * <h1>설명</h1>
 * <p>
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * <p>
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * <p>
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 * <p>
 * 알파벳 이외의 문자들의 무시합니다.
 *
 * <h1>입력</h1>
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 * <h1>출력</h1>
 * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
 */
class PalindromeValidTest {

    private PalindromeValid solve = new PalindromeValid();

    @MethodSource
    @ParameterizedTest
    void solution(final String sentence, final boolean expected) {
        final boolean actual = solve.solution(sentence);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of("found7, time: study; Yduts; emit, 7Dnuof", true),
            Arguments.of("12551asfsdg. 125919; sdgsdasf, 120uasf", false),
            Arguments.of("[asl'gka125810abc;as;f10289as']", false)
        );
    }

}