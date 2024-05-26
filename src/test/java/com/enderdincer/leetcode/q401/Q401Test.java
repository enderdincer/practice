package com.enderdincer.leetcode.q401;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class Q401Test {

    private static Stream<Arguments> solutionParams() {
        return Stream.of(
                Arguments.of(1, List.of("0:08", "8:00", "0:04", "0:16", "0:02", "0:01", "1:00", "4:00", "2:00", "0:32")),
                Arguments.of(2, List.of("0:09", "0:06", "2:08", "4:02", "8:08", "0:40", "4:04", "4:08", "0:48", "1:16", "8:01", "0:05", "0:24", "2:04", "0:03", "8:04", "6:00", "2:02", "2:01", "8:02", "0:20", "1:32", "4:01", "1:08", "0:17", "0:18", "2:32", "10:00", "4:16", "1:04", "2:16", "9:00", "8:32", "0:36", "1:02", "0:33", "5:00", "1:01", "4:32", "8:16", "0:34", "0:12", "3:00", "0:10")),
                Arguments.of(3, List.of("1:18", "4:03", "0:41", "4:05", "4:06", "4:09", "1:17", "0:49", "9:16", "8:48", "0:44", "1:12", "3:32", "0:42", "1:10", "1:20", "0:52", "0:50", "4:17", "4:18", "7:00", "6:32", "1:24", "4:10", "0:56", "4:12", "2:09", "4:24", "11:00", "10:32", "2:06", "9:32", "2:05", "1:36", "2:03", "4:20", "1:34", "1:33", "2:10", "5:04", "4:36", "1:40", "5:08", "2:18", "2:17", "1:48", "5:01", "2:12", "4:33", "5:02", "4:34", "0:07", "10:08", "2:20", "8:09", "5:16", "4:48", "8:06", "4:40", "2:24", "8:05", "8:03", "0:19", "10:16", "3:01", "3:02", "8:17", "3:04", "8:18", "3:08", "8:12", "0:13", "8:10", "0:14", "2:36", "0:11", "2:34", "2:33", "0:28", "6:04", "2:40", "3:16", "6:08", "0:26", "8:20", "2:48", "0:25", "5:32", "6:01", "0:22", "8:24", "6:02", "0:21", "8:40", "1:09", "6:16", "9:08", "10:02", "10:01", "10:04", "9:01", "1:06", "8:33", "0:37", "9:02", "1:05", "8:34", "0:38", "0:35", "1:03", "9:04", "8:36")),
                Arguments.of(7, List.of("11:39", "7:39", "11:43", "10:31", "5:59", "11:23", "11:45", "10:55", "3:59", "11:46", "11:27", "10:59", "7:53", "7:30", "7:54", "5:31", "9:55", "7:57", "3:31", "5:55", "7:15", "6:47", "7:58", "3:55", "9:59", "9:31", "7:51", "11:29", "11:54", "5:47", "7:27", "11:53", "6:59", "3:47", "7:29", "11:58", "11:57", "11:15", "10:47", "7:43", "6:31", "7:46", "7:23", "7:45", "6:55", "11:30", "9:47", "11:51")),
                Arguments.of(9, List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("com.enderdincer.leetcode.q401.Q401Test#solutionParams")
    void readBinaryWatch1(int turnedOnLedNum, List<String> solution) {
        final var result = new Solution1().readBinaryWatch(turnedOnLedNum);
        assertThat(result).containsExactlyInAnyOrderElementsOf(solution);
    }

    // todo
//    @ParameterizedTest
//    @MethodSource("com.enderdincer.leetcode.q401.TestCases#solutionParams")
//    void readBinaryWatch2(int turnedOnLedNum, List<String> solution) {
//        final var result = new Solution2().readBinaryWatch(turnedOnLedNum);
//        assertThat(result).containsExactlyInAnyOrderElementsOf(solution);
//    }
}
