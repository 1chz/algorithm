package practice.string;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <pre>
 * <h1>3. 문장 속 단어</h1>
 * <h1>설명</h1>
 *
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 *
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 *
 * <h1>입력</h1>
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * <h1>출력</h1>
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 *
 * 단어를 답으로 합니다.
 * </pre>
 */
class WordInSentenceTest {

    private WordInSentence solve = new WordInSentence();

    @MethodSource
    @ParameterizedTest
    void solution(final String sentence, final String expected) {
        final String actual = solve.solution(sentence);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of("it is time to study", "study"),
            Arguments.of("aa aaa aa bbb", "aaa")
        );
    }

}