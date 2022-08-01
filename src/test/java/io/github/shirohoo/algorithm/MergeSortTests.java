package io.github.shirohoo.algorithm;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortTests {
    @MethodSource
    @ParameterizedTest
    void mergeSortAsc(int[] array, int[] sortedArray) {
        // given
        MergeSort sut = new MergeSort();

        // when
        sut.mergeSort(array);

        // then
        assertThat(array).isEqualTo(sortedArray);
    }

    static Stream<Arguments> mergeSortAsc() {
        return Stream.of(
                Arguments.of(new int[]{6, 5, 3, 2, 1, 4}, new int[]{1, 2, 3, 4, 5, 6}),
                Arguments.of(new int[]{4, 1, 3, 9, 7}, new int[]{1, 3, 4, 7, 9}),
                Arguments.of(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
        );
    }

    @MethodSource
    @ParameterizedTest
    void mergeSortDesc(int[] array, int[] sortedArray) {
        // given
        MergeSort sut = new MergeSort();

        // when
        sut.mergeSort(array, true);

        // then
        assertThat(array).isEqualTo(sortedArray);
    }

    static Stream<Arguments> mergeSortDesc() {
        return Stream.of(
                Arguments.of(new int[]{6, 5, 3, 2, 1, 4}, new int[]{6, 5, 4, 3, 2, 1}),
                Arguments.of(new int[]{4, 1, 3, 9, 7}, new int[]{9, 7, 4, 3, 1}),
                Arguments.of(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1})
        );
    }
}
