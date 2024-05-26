package com.enderdincer.leetcode.q16;

class Solution1 {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int minSum = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                for (int k = 0; k < nums.length; k++) {
                    if (i == k || j == k) continue;
                    int sum = nums[i] + nums[j] + nums[k];
                    int diff = Math.abs(sum - target);
                    if (diff < minDiff) {
                        minDiff = diff;
                        minSum = sum;
                    }
                }
            }
        }
        return minSum;
    }
}
