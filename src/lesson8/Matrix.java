package lesson8;

import java.util.Arrays;

public class Matrix {
    private double[][] arr;
    private int rows, columns;

    public Matrix(double[][] arr) {
        setArr(arr);
    }

    public void setArr(double[][] arr) {
        this.arr = arr;
        this.rows = arr.length;
        this.columns = arr[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getColums() {
        return columns;
    }

    public void matrixSum(Matrix matrix) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColums(); j++)
                this.arr[i][j] += matrix.arr[i][j];
        }
    }

    public void matrixMultiply(int a) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColums(); j++)
                this.arr[i][j] *= a;
        }
    }

    public void printMatrix() {
        System.out.println(Arrays.deepToString(arr));
    }
}