package com.enderdincer.leetcode.q52;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCases {

    private static Stream<Arguments> queenNumToSolutionParams() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 0),
                Arguments.of(3, 0),
                Arguments.of(4, 2),
                Arguments.of(5, 10),
                Arguments.of(6, 4),
                Arguments.of(7, 40)
        );
    }

    @ParameterizedTest
    @MethodSource("com.enderdincer.leetcode.q52.TestCases#queenNumToSolutionParams")
    void totalNQueens(int boardSize, int solution) {
        final var result = new Solution().totalNQueens(boardSize);
        assertThat(result).isEqualTo(solution);
    }
}
