package org.hosam.medium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ThreeNumberSum
 * write a function that take non empty array with distinct integer and
 * the target that is sum of any 3 number in the array
 * the function should return all triplet array that sum equal the target
 * the triplet array should return in ascending order with respect to the number that they hold.
 */

public class ThreeNumberSum {
    // time complexity O(N^2) , Space Complexity O(1)
    public static List<int[]> threeNumberSum(int[] array, int targetSum) {

        Arrays.sort(array);
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum) {
                    int[] triplet = {array[i], array[left], array[right]};
                    result.add(triplet);
                    left += 1;
                    right -= 1;
                } else if (currentSum < targetSum) {
                    left += 1;
                } else {
                    right -= 1;
                }
            }
        }
        return result;

    }


}
