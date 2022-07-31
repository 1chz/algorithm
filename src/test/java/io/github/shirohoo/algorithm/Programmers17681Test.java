package io.github.shirohoo.algorithm;

import static org.assertj.core.api.Assertions.assertThat;
import io.github.shirohoo.algorithm.Programmers17681;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * 문제 링크: https://programmers.co.kr/learn/courses/30/lessons/17681
 */
@DisplayName("프로그래머스 17681 - [1차] 비밀지도")
class Programmers17681Test {
    Programmers17681 solve = new Programmers17681();

    static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(
                5,
                new int[]{9, 20, 28, 18, 11},
                new int[]{30, 1, 21, 17, 28},
                new String[]{"#####", "# # #", "### #", "#  ##", "#####"}
            ),
            Arguments.of(
                6,
                new int[]{46, 33, 33, 22, 31, 50},
                new int[]{27, 56, 19, 14, 14, 10},
                new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "}
            )
        );
    }

    @MethodSource
    @ParameterizedTest
    void solution(int n, int[] arr1, int[] arr2, String[] expected) throws Exception {
        String[] actual = solve.solution(n, arr1, arr2);
        assertThat(actual).containsExactly(expected);
    }
}
