package com.enderdincer.leetcode.q969;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int tempMax = -1;
            int tempJ = -1;
            boolean isAscending = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > tempMax) {
                    tempMax = arr[j];
                    tempJ = j;
                } else {
                    isAscending = false;
                }
            }
            if (isAscending) return result;
            flipSubArrayInPlace(arr, 0, tempJ+1);
            result.add(tempJ+1);
            flipSubArrayInPlace(arr, 0, arr.length-i);
            result.add(arr.length-i);
        }
        return result;
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
