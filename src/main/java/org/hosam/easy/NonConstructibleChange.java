package org.hosam.easy;


import java.util.Arrays;

/**
 * Given an array of positive integers representing the values of coins in your possession,
 * write a function that returns the minimum amount of change (the minimum sum of money)
 * that you cannot create. The given coins can have any positive integer value and aren't
 * necessarily unique (i.e., you can have multiple coins of the same value).
 * <p>
 * For example, if you're given coins = [1, 2, 5], the minimum amount of change that you
 * can't create is 4. If you're given no coins, the minimum amount of change that you can't
 * create is 1.
 * <p>
 * Sample Input
 * coins = [5, 7, 1, 1, 2, 3, 22]
 * Sample Output
 * 20
 */

public class NonConstructibleChange {

    //  time complexity is O(n) and space complexity is o(1)
    public static int nonConstructibleChange(int[] coins) {
        int min_sum = 0;
        Arrays.sort(coins);
        for (int coin : coins) {
            int potential_min_sum = min_sum + 1;
            if (coin > potential_min_sum) return potential_min_sum;
            else min_sum += coin;
        }
        return min_sum + 1;

    }
}
