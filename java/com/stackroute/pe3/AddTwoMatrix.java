package com.stackroute.pe3;

public class AddTwoMatrix {
    public AddTwoMatrix() {

    }

    public int[][] matrixAddition(int row, int col, int[][] matrix1, int matrix2[][]) {

        try {
            int result[][] = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return result;
        }
        catch (Exception e) {
            return null;
        }
    }
}