package lesson8;

import java.lang.reflect.Array;

public class Matrix {
    int[] ar;
    int str;
    int stl;


    public static int[][] matrixSum(int matrix1[][], int matrix2[][]) {
        int sum[][] = new int[4][4];
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    public static void printMatrix(int matrix3[][]) {
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3.length; j++) {
            }

        }
    }

    public static void matrixSum() {

    }
}