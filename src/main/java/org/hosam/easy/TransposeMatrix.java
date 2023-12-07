package org.hosam.easy;

public class TransposeMatrix {


    // time complexity is O(m×n)
    public static int[][] transposeInPlace(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < columns; j++) {
                // Swap elements [i][j] and [j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return matrix;
    }
}
