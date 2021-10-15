package practice.array;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * <h1>2. 보이는 학생</h1>
 * <h1>설명</h1>
 * <p>
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 * <p>
 * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 *
 * <h1>입력</h1>
 * 첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
 *
 * <h1>출력</h1>
 * 선생님이 볼 수 있는 최대학생수를 출력한다.
 */
public class NumberOfVisibleStudentTest {

    private NumberOfVisibleStudent solve = new NumberOfVisibleStudent();

    @MethodSource
    @ParameterizedTest
    void solution(final String testCase, final int expected) {
        final int actual = solve.solution(testCase);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of("130 135 148 140 145 150 150 153", 5)
        );
    }

}
