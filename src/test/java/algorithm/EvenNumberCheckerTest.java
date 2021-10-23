package algorithm;

import static org.assertj.core.api.Assertions.*;
import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class EvenNumberCheckerTest {

    private EvenNumberChecker evenNumberChecker = new EvenNumberChecker();

    @MethodSource
    @ParameterizedTest
    void isEvenNumber(final int number, final boolean expected) throws Exception {
        final boolean actual = evenNumberChecker.check(number);
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> isEvenNumber() {
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
