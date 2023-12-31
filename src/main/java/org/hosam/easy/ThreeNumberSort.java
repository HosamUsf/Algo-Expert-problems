package org.hosam.easy;


/**
 * Find Three Largest Numbers✩
 * Write a function that takes in an array of at least three integers and, without sorting
 * the input array, returns a sorted array of the three largest integers in the input array.
 * The function should return duplicate integers if necessary; for example, it should
 * return [10, 10, 12] for an input array of [10, 5, 9, 10, 12].
 * Sample Input
 * array = [141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7]
 * Sample Output
 * [18, 141, 541]
 */
public class ThreeNumberSort {

    //  time complexity is O(n) and space complexity is o(1)
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] result = {array[0], array[1], array[2]};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result[2]) {
                result[0] = result[1];
                result[1] = result[2];
                result[2] = array[i];
            } else if (array[i] > result[1]) {
                result[0] = result[1];
                result[1] = array[i];
            } else if (array[i] > result[0]) {
                result[0] = array[i];
            } else continue;
        }

        return result;
    }
}
