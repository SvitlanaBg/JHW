package lesson8;

import java.lang.reflect.Array;

public class Matrix {
    private int[][] arr;
    private int rows, columns;

    public Matrix(int[][] arr) {
        setArr(arr);
    }

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
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

    public void matrixSum(Matrix matrix1, Matrix matrix2) {
        System.out.println("Сложение двух матриц");
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColums(); j++) {
                System.out.print(matrix1.arr[i][j] + matrix2.arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void matrixMultiply(Matrix matrix, int a) {
        System.out.println("Умножение матрицы на число " + a);
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColums(); j++) {
                System.out.print(matrix.arr[i][j] * a + " ");
            }
            System.out.println();
        }
    }

    public void printMatrix(Matrix matrix) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColums(); j++) {
                System.out.print(matrix.arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}