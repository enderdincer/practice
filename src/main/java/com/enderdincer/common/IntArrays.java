package com.enderdincer.common;

public class IntArrays {

    public static boolean isNullOrEmpty(int[] arr) {
        return arr == null || arr.length == 0;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArrayInPlace(int[] arr) {
        if (isNullOrEmpty(arr)) return;
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - 1 - i);
        }
    }

    public static void reverseSubArrayInPlace(int[] arr, int startInclusive, int endInclusive) {
        if (isNullOrEmpty(arr)) return;
        for (int i = 0; i <= (endInclusive - startInclusive) / 2; i++) {
            swap(arr, startInclusive + i, endInclusive - i);
        }
    }
}
