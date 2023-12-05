package org.hosam.medium;

import java.util.Arrays;

/**
 * Smallest Difference
 * Write a function that takes in two non-empty arrays of integers, finds the
 * pair of numbers (one from each array) whose absolute difference is closest
 * to zero, and returns an array containing these two numbers, with the number
 * from the first array in the first position.
 * <p>
 * Note that the absolute difference of two integers is the distance between them on the real number line. For example, the absolute difference of -5 and 5 is 10, and the absolute difference of -5 and -4 is 1.
 * <p>
 * You can assume that there will only be one pair of numbers with the smallest difference.
 * <p>
 * Sample Input
 * arrayOne = [-1, 5, 10, 20, 28, 3]
 * arrayTwo = [26, 134, 135, 15, 17]
 * <p>
 * Sample Output
 * [28, 26]
 */

public class SmallestDifference {
    // time complexity O(n^2) , space Complexity O(1)
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] result = new int[2];
        int min = Integer.MAX_VALUE;
        ;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                int diff = Math.abs(arrayOne[i] - arrayTwo[j]);
                if (diff < min) {
                    min = diff;

                    result[0] = arrayOne[i];
                    result[1] = arrayTwo[j];
                }
            }
        }
        return result;
    }


    //better approach using two pointers
    // time complexity(nlogn), space complexity O(1)
    public static int[] smallestDifferenceSorted(int[] arrayOne, int[] arrayTwo) {
        int[] result = new int[2];
        int min = Integer.MAX_VALUE;
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int i = 0;
        int j = 0;

        while (i < arrayOne.length && j < arrayTwo.length) {
            int currentDiff = Math.abs(arrayOne[i] - arrayTwo[j]);

            if (currentDiff < min) {
                min = currentDiff;
                result[0] = arrayOne[i];
                result[1] = arrayTwo[j];
            }
            if (arrayOne[i] < arrayTwo[j]) i++;
            else j++;
        }

        return result;
    }

}
