package org.hosam.medium;

/**
 * You're given an array of integers and an integer. Write a function that moves
 * all instances of that integer in the array to the end of the array and returns
 * the array.
 * <p>
 * The function should perform this in place (i.e., it should mutate the input array)
 * and doesn't need to maintain the order of the other integers.
 * <p>
 * Sample Input
 * array = [2, 1, 2, 2, 2, 3, 4, 2]
 * toMove = 2
 * Sample Output
 * [1, 3, 4, 2, 2, 2, 2, 2] // the numbers 1, 3, and 4 could be ordered differently
 */


public class MoveElementToEnd {

    //  O(n) time | O(1) space - where n is the length of the array
    public static int[] moveElementToEnd(int[] array, int toMove) {
        int track = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != toMove) {
                array[track] = array[i];
                track++;
            }
        }
        for (int i = track; i < array.length; i++) {
            array[i] = toMove;
        }

        return array;
    }
}
