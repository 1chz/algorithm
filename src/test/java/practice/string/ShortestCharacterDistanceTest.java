package practice.string;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>10. 가장 짧은 문자거리</h1>
 * <h1>설명</h1>
 * <p>
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 * <h1>입력</h1>
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * <p>
 * 문자열의 길이는 100을 넘지 않는다.
 *
 * <h1>출력</h1>
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 */
@DisplayName("문자열 - 문장 속 단어")
class ShortestCharacterDistanceTest {

    private ShortestCharacterDistance solve = new ShortestCharacterDistance();

    @MethodSource
    @ParameterizedTest
    void solution(final String sentence, final char ch, final String expected) {
        final String actual = solve.solution(sentence, ch);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of("teachermode", 'e', "1 0 1 2 1 0 1 2 2 1 0")
        );
    }

}