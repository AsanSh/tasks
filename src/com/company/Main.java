package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int num = r.nextInt(10);
            arr[i] = num;

        }
        System.out.println(Arrays.toString(arr));
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j] + 1) {
                    max = arr[i];
                }
                if (arr[i] < arr[j] - 1) {
                    min = arr[i];
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}