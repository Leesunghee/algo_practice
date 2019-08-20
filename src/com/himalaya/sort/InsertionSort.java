package com.himalaya.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] target = {254,3,213,64,75,56,4,324,65,78,9,5,76,3410,8,342,76};
//        int[] target = {254,3,213,64};

        sort(target);

        System.out.println("sorted target : " + Arrays.toString(target));
    }

    private static void sort(int[] target) {

        int size = target.length;

        for (int i = 0; i < size; i++) {

            int temp;

            if ((i + 1) < size) {
                for (int j = i + 1; j > 0 && target[j - 1] > target[j]; j--) {
                    temp = target[j];
                    target[j] = target[j - 1];
                    target[j - 1] = temp;
                }
            }
        }

    }
}
