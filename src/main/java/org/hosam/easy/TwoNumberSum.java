package org.hosam.easy;

import java.util.Arrays;
import java.util.HashMap;


/**
 * Two Number Sum
 * Write a function that takes in a non-empty array of distinct integers and an integer representing
 * a target sum. If any two numbers in the input array sum up to the target sum,
 * the function should return them in an array, in any order. If no two numbers sum up to the target sum,
 * the function should return an empty array.
 * <p>
 * Note that the target sum has to be obtained by summing two different integers in the array;
 * you can't add a single integer to itself in order to obtain the target sum.
 * <p>
 * You can assume that there will be at most one pair of numbers summing up to the target sum.
 * <p>
 * Sample Input
 * array = [3, 5, -4, 8, 11, 1, -1, 6]
 * targetSum = 10
 * Sample Output
 * [-1, 11] // the numbers could be in reverse order
 */

public class TwoNumberSum {

    // O(nLog(n)) time | O(1) space
    public static int[] twoNumberSumSorted(int[] array, int targetSum) {
        Arrays.sort(array);     // O(nLog(n)) time
        int left = 0;
        int right = array.length - 1;
        while (left < right) {       // O(n) time
            int currentSum = array[left] + array[right];
            if (currentSum < targetSum) {
                left++;
            } else if (currentSum > targetSum) {
                right--;
            } else {
                return new int[]{array[left], array[right]};
            }
        }
        return new int[] {};
    }

    // O(n) time | O(n) space
    public int[] TwoNumberSum(int[] n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : n) {
            int potentialMatch = target - j;
            if (map.containsKey(potentialMatch)) {
                return new int[]{potentialMatch, j};
            } else
                map.put(j, target - j);
        }
        return new int[]{};

    }
}

