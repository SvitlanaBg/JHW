package lesson8;

/**
 * Создать класс "Матрица". Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;
 * 2) умножение на число;
 * 3) вывод на печать.
 */
public class Task3Matrix {
    public static void main(String[] args) {
        int a = 5;
        Matrix matrix1 = new Matrix(new int[][]{
                {5, 5, 7, 7},
                {7, 5, 6, 1},
                {9, 1, 3, 2}
        });

        Matrix matrix2 = new Matrix(new int[][]{
                {7, -5, 17, 27},
                {8, -53, -6, 14},
                {12, 21, 23, 22}
        });

        System.out.println("Количество строк матрицы: " + matrix1.getRows());
        System.out.println("Количество столбцов матрицы: " + matrix1.getColums());
        matrix1.printMatrix(matrix1);

        System.out.println("Количество строк матрицы: " + matrix2.getRows());
        System.out.println("Количество столбцов матрицы: " + matrix2.getColums());
        matrix1.printMatrix(matrix2);

        matrix1.matrixSum(matrix1, matrix2);
        matrix1.matrixMultiply(matrix1, a);
        matrix2.matrixMultiply(matrix2, a);

    }
}
