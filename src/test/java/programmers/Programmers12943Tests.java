package programmers;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/12943?language=java
 */
@DisplayName("프로그래머스 12943 - 콜라츠 추측")
class Programmers12943Tests {
    Programmers12943 solve;

    static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(6, 8),
            Arguments.of(16, 4),
            Arguments.of(626331, -1)
        );
    }

    @BeforeEach
    void setUp() {
        solve = new Programmers12943();
    }

    @MethodSource
    @ParameterizedTest
    void solution(int n, int expected) {
        assertThat(solve.solution(n)).isEqualTo(expected);
    }
}
