package practice.string;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <pre>
 * <h1>4. 단어 뒤집기</h1>
 * <h1>설명</h1>
 *
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 *
 * <h1>입력</h1>
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 *
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * <h1>출력</h1>
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 * </pre>
 */
@DisplayName("문자열 - 단어 뒤집기")
class ReverseWordTest {

    private ReverseWord solve = new ReverseWord();

    @MethodSource
    @ParameterizedTest
    void solution(final String[] words, final String[] expected) {
        final String[] actual = solve.solution(words);
        Assertions.assertThat(actual).containsExactly(expected);
    }

    @MethodSource("solution")
    @ParameterizedTest
    void solution2(final String[] words, final String[] expected) {
        final String[] actual = solve.solution2(words);
        Assertions.assertThat(actual).containsExactly(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(new String[]{"good", "Time", "Big"}, new String[]{"doog", "emiT", "giB"}),
            Arguments.of(new String[]{"abs", "robot"}, new String[]{"sba", "tobor"})
        );
    }

}