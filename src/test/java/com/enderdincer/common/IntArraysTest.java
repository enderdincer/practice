package com.enderdincer.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IntArraysTest {

    private static Stream<Arguments> swapTestArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, 0, 1, new int[]{2, 1}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 0, 1, new int[]{2, 1, 3, 4, 5}),
                Arguments.of(new int[]{1, 2, 3}, 1, 2, new int[]{1, 3, 2}),
                Arguments.of(new int[]{1, 2, 3}, 0, 2, new int[]{3, 2, 1}),
                Arguments.of(new int[]{1, 2, 3, 4}, 1, 2, new int[]{1, 3, 2, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("com.enderdincer.common.IntArraysTest#swapTestArguments")
    public void swapTest(int[] given, int i, int j, int[] expected) {
        IntArrays.swap(given, i, j);
        Assertions.assertThat(given).isEqualTo(expected);
    }

    private static Stream<Arguments> reverseArrayInPlaceTestArguments() {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{3, 2, 1}),
                Arguments.of(new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{1, 3, 4, 5}, new int[]{5, 4, 3, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("com.enderdincer.common.IntArraysTest#reverseArrayInPlaceTestArguments")
    public void reverseArrayInPlaceTest(int[] given, int[] expected) {
        IntArrays.reverseArrayInPlace(given);
        Assertions.assertThat(given).isEqualTo(expected);
    }

    private static Stream<Arguments> reverseSubArrayInPlaceTestArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, 1, 2, new int[]{1, 3, 2, 4}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 0, 6, new int[]{7, 6, 5, 4, 3, 2, 1}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 0, 2, new int[]{3, 2, 1, 4, 5, 6, 7}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 4, 6, new int[]{1, 2, 3, 4, 7, 6, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("com.enderdincer.common.IntArraysTest#reverseSubArrayInPlaceTestArguments")
    public void reverseSubArrayInPlaceTest(int[] given, int i, int j, int[] expected) {
        IntArrays.reverseSubArrayInPlace(given, i, j);
        Assertions.assertThat(given).isEqualTo(expected);
    }
}
