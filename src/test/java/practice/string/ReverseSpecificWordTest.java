package practice.string;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>5. 특정 문자 뒤집기</h1>
 * <h1>설명</h1>
 *
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 *
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 *
 * <h1>입력</h1>
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 *
 * <h1>출력</h1>
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */
@DisplayName("문자열 - 특정 문자 뒤집기")
class ReverseSpecificWordTest {

    private ReverseSpecificWord solve = new ReverseSpecificWord();

    @MethodSource
    @ParameterizedTest
    void solution(final String sentence, final String expected) {
        final String actual = solve.solution(sentence);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of("a#b!GE*T@S", "S#T!EG*b@a"),
            Arguments.of("##b!GE*T@S", "##S!TE*G@b"),
            Arguments.of("cB##b!GE*T@S", "ST##E!Gb*B@c")
        );
    }

}