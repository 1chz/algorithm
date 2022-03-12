package codingtest.skt;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Q1Tests {
    Q1 question;

    static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(4578, new int[]{1, 4, 99, 35, 50, 1000}, 2308),
            Arguments.of(1999, new int[]{2, 11, 20, 100, 200, 600}, 2798)
        );
    }

    @BeforeEach
    void setUp() {
        question = new Q1();
    }

    @MethodSource
    @ParameterizedTest
    void solution(int money, int[] costs, int expected) {
        int result = question.solution(money, costs);
        assertThat(result).isEqualTo(expected);
    }
}
