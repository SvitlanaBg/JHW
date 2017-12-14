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
        int a = 5; //умножение на число
        Matrix matrix1 = new Matrix(new double[][]{
                {5, 5, 7, 7},
                {7, 5.3, 6, 1},
                {9.5, 1, 3, 2}
        });

        Matrix matrix2 = new Matrix(new double[][]{
                {7, -5, 17.2, 27},
                {8.32, -53, -6, 14},
                {12, 21.1, 23, 22}
        });

        System.out.println("Количество строк матрицы: " + matrix1.getRows());
        System.out.println("Количество столбцов матрицы: " + matrix1.getColums());
        matrix1.printMatrix();

        System.out.println("Количество строк матрицы: " + matrix2.getRows());
        System.out.println("Количество столбцов матрицы: " + matrix2.getColums());
        matrix2.printMatrix();

        System.out.println("Сложение матриц");
        matrix1.matrixSum(matrix2);
        matrix1.printMatrix();

        System.out.println("Умножение матрицы на число " + a);
        matrix1.matrixMultiply(a);
        matrix1.printMatrix();
    }
}
