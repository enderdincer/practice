package com.enderdincer.leetcode.q52;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    private static final String DOT = ".";
    private static final String Q = "Q";

    public int totalNQueens(int n) {
        Set<List<String>> result = new HashSet<>();
        rec(n, new int[n][n], new ArrayList<>(), result, 0);
        return result.size();
    }

    private void rec(int n, int[][] pos, List<String> temp, Set<List<String>> result, int start) {
        if (temp.size() == n) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (pos[i][j] >= 1)
                    continue;

                // place queen
                pos[i][j]++;
                for (int k = 1; k < n; k++) {
                    if (i+k < n) pos[k+i][j]++;
                    if (j + k < n && i+k < n) pos[k+i][j + k]++;
                    if (j - k >= 0 && i + k < n) pos[i+k][j - k]++;
                }
                temp.add(DOT.repeat(j) + Q + DOT.repeat(n - j - 1));
                rec(n, pos, temp, result, i+1);
                // backtrack
                pos[i][j]--;
                for (int k = 1; k < n; k++) {
                    if (i+k < n) pos[k+i][j]--;
                    if (j + k < n && i+k < n) pos[k+i][j + k]--;
                    if (j - k >= 0 && i + k < n) pos[i+k][j - k]--;
                }
                temp.remove(temp.size() - 1);
            }

        }
    }
}
