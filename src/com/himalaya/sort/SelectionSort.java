package com.himalaya.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] target = {254,3,213,64,75,56,4,324,65,78,9,5,76,3410,8,342,76};

        sort(target);

        System.out.println("sorted target : " + Arrays.toString(target));

    }

    private static void sort(int[] target) {

        int size = target.length;

        for (int i = 0; i < size - 1; i++) {

            int min_value;

            for (int j = i + 1; j < size; j++) {

                if (target[i] > target[j]) {
                    min_value = target[j];
                    target[j] = target[i];
                    target[i] = min_value;
                }
            }
        }
    }
}
