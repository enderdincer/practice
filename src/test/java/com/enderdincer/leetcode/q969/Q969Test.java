package com.enderdincer.leetcode.q969;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class Q969Test {

    private static Stream<Arguments> solutionParams() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 4, 1}),
                Arguments.of(new int[]{1, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("com.enderdincer.leetcode.q969.Q969Test#solutionParams")
    void pancakeSort(int[] nums) {
        final var given = Arrays.copyOf(nums, nums.length);
        System.out.println("Given:" + Arrays.toString(nums));
        final var result = new Solution().pancakeSort(nums);
        for (int i : result) {
            flipSubArrayInPlace(given, 0, i);
        }
        System.out.println("Result: " + result);
        System.out.println("Sorted: " + Arrays.toString(given));
        assertThat(nums).isSorted();
    }

    private void flipSubArrayInPlace(int[] arr, int startInclusive, int endExclusive) {
        for (int i = startInclusive; i < endExclusive / 2; i++) {
            swapInPlace(arr, i, endExclusive - 1 - i);
        }
    }

    private void swapInPlace(int[] arr, int i, int j) {
        final int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
