package org.hosam.easy;


import java.util.List;
import java.util.Objects;


/**
 * Validate Subsequence
 * <p>
 * Given two non-empty arrays of integers, write a function that determines whether
 * the second array isa subsequence of the first one. A subsequence of an array
 * is a set of numbers that aren't necessarily adjacent in the array but that are
 * in the same order as they appear in the array. For instance, the numbers [1, 3, 4]
 * form a subsequence of the array [1, 2, 3, 4], and so do the numbers [2, 4].
 * note that a single number in an array and the array itself are both valid subsequences of the array.
 * <p>
 * Sample Input
 * array = [5, 1, 22, 25, 6, -1, 8, 10]
 * sequence = [1, 6, -1, 10]
 * <p>
 * Sample Output
 * true
 */
public class ValidateSubsequence {
    //  time complexity is O(n) and space complexity is o(1)
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        int j = 0;
        for (int i = 0; i < array.size(); i++) {
            if (j == sequence.size()) return true;

            if (Objects.equals(array.get(i), sequence.get(j))) {
                j++;
            }
        }
        return j == sequence.size();


    }

}
