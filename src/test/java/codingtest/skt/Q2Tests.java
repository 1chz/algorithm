package codingtest.skt;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Q2Tests {
    Q2 question;

    static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(5, true, "[[1, 2, 3, 4, 1], [4, 5, 6, 5, 2], [3, 6, 7, 6, 3], [2, 5, 6, 5, 4], [1, 4, 3, 2, 1]]"),
            Arguments.of(6, false,
                "[[1, 5, 4, 3, 2, 1], [2, 6, 8, 7, 6, 5], [3, 7, 9, 9, 8, 4], [4, 8, 9, 9, 7, 3], [5, 6, 7, 8, 6, 2], [1, 2, 3, 4, 5, 1]]"),
            Arguments.of(9, false,
                "[[1, 8, 7, 6, 5, 4, 3, 2, 1], [2, 9, 14, 13, 12, 11, 10, 9, 8], [3, 10, 15, 18, 17, 16, 15, 14, 7], [4, 11, 16, 19, 20, 19, 18, "
                + "13, 6], [5, 12, 17, 20, 21, 20, 17, 12, 5], [6, 13, 18, 19, 20, 19, 16, 11, 4], [7, 14, 15, 16, 17, 18, 15, 10, 3], [8, 9, 10, "
                + "11, 12, 13, 14, 9, 2], [1, 2, 3, 4, 5, 6, 7, 8, 1]]")
        );
    }

    @BeforeEach
    void setUp() {
        question = new Q2();
    }

    @MethodSource
    @ParameterizedTest
    void solution(int n, boolean clockwise, String expected) {
        int[][] result = question.solution(n, clockwise);
        assertThat(Arrays.deepToString(result)).isEqualTo(expected);
    }
}
