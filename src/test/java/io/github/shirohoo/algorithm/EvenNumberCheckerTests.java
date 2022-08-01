package io.github.shirohoo.algorithm;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class EvenNumberCheckerTests {
    @MethodSource
    @ParameterizedTest
    void isEvenNumber(int number, boolean expected) throws Exception {
        // given
        EvenNumberChecker sut = new EvenNumberChecker();

        // when
        boolean actual = sut.check(number);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> isEvenNumber() {
        return Stream.of(
                Arguments.of(5, false),
                Arguments.of(45, false),
                Arguments.of(4, true),
                Arguments.of(16, true),
                Arguments.of(99, false),
                Arguments.of(100, true),
                Arguments.of(55, false),
                Arguments.of(52, true),
                Arguments.of(54, true)
        );
    }
}
