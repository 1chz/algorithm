package practice.string;

import static org.assertj.core.api.Assertions.*;
import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>12. 암호</h1>
 * <h1>설명</h1>
 * <p>
 * 현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
 * <p>
 * 비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.
 * <p>
 * 비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.
 * <p>
 * 만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.
 * <p>
 * 1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *은 이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.
 * <p>
 * 2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
 * <p>
 * 3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
 * <p>
 * 참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.
 * <p>
 * 현수가 4개의 문자를 다음과 같이 신호로 보냈다면
 * <p>
 * #****###**#####**#####**##**
 * <p>
 * 이 신호를 4개의 문자신호로 구분하면
 * <p>
 * #****## --> 'C'
 * <p>
 * #**#### --> 'O'
 * <p>
 * #**#### --> 'O'
 * <p>
 * #**##** --> 'L'
 * <p>
 * 최종적으로 “COOL"로 해석됩니다.
 * <p>
 * 현수가 보낸 신호를 해석해주는 프로그램을 작성해서 영희를 도와주세요.
 *
 * <h1>입력</h1>
 * 7의 배수크기의 #또는 * 신호가 입력됩니다.
 * <p>
 * 현수는 항상 대문자로 해석할 수 있는 신호를 보낸다고 가정합니다.
 *
 * <h1>출력</h1>
 * 영희가 해석한 문자열을 출력합니다.
 */
@DisplayName("문자열 - 암호")
public class CryptogramTest {

    private Cryptogram solve = new Cryptogram();

    @MethodSource
    @ParameterizedTest
    void solution(final int charCount, final String cryptogram, final String expected) {
        final String actual = solve.solution(charCount, cryptogram);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.arguments(4, "#****###**#####**#####**##** ", "COOL")
        );
    }

}
