package com.enderdincer.leetcode.q401;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// slow solution
class Solution1 {

    private static final String COLON = ":";

    public List<String> readBinaryWatch(int turnedOn) {
        if (turnedOn > 8) return List.of();
        Set<String> result = new HashSet<>();
        rec(turnedOn, new int[4+6], result);
        return new ArrayList<>(result);
    }

    private void rec(int n, int[] leds, Set<String> result) {
        if (n == 0) {
            final var time = toTime(leds);
            if (time != null) result.add(time);
            return;
        }

        for(int i=0; i<leds.length; i++) {
            if (leds[i] == 1) continue;
            leds[i] = 1;
            rec(n-1, leds, result);
            leds[i] = 0;
        }
    }


    private String toTime(int[] leds) {
        int h = 0;
        int m = 0;
        for (int i =0; i<leds.length; i++) {
            if (leds[i] == 0) continue;
            if (i < 4) {
                h += (int) Math.pow(2, i);
                continue;
            }

            m += (int) Math.pow(2, i - 4);
        }
        if (h > 11) return null;
        if (m > 59) return null;
        String minutePrefix = m < 10 ? "0" : "";
        return String.valueOf(h) + COLON + minutePrefix + String.valueOf(m);
    }
}