package org.hosam;

import java.util.Arrays;

import static org.hosam.easy.ThreeNumberSort.findThreeLargestNumbers;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        int[] result1 = findThreeLargestNumbers(array1);
        System.out.println(Arrays.toString(result1));
        // Expected output: [18, 141, 541]

        int[] array2 = {10, 5, 9, 10, 12};
        int[] result2 = findThreeLargestNumbers(array2);
        System.out.println(Arrays.toString(result2));
        // Expected output: [10, 10, 12]

        int[] array3 = {5, 5, 5, 5, 5, 5};
        int[] result3 = findThreeLargestNumbers(array3);
        System.out.println(Arrays.toString(result3));
        // Expected output: [5, 5, 5] (All numbers are the same)

        int[] array4 = {-10, -5, -8, -1, -15};
        int[] result4 = findThreeLargestNumbers(array4);
        System.out.println(Arrays.toString(result4));
        // Expected output: [-10, -5, -1] (Negative numbers)

        int[] array5 = {1, 2, 3, 4, 5, 6};
        int[] result5 = findThreeLargestNumbers(array5);
        System.out.println(Arrays.toString(result5));
        // Expected output: [4, 5, 6] (Normal sequence)
    }
}


