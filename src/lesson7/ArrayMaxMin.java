package lesson7;

import java.util.Arrays;

/**
 * Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации.
 * Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2. Распечатать оба массива.
 */
public class ArrayMaxMin {
    public static void main(String[] args) {

        int[][] array1 = {
                {5, 7, 45, 98, -3, 7, 12, 45},
                {21, 32, 54, 12, 14, 74, 52, 22},
                {37, 320, 54, -112, 14, 74, 52, 22},
                {75, 32, 545, 12, 14, 74, 52, 22},
                {25, 321, 54, 12, -14, 74, 52, 22},
        };
        int[] array2 = new int[2];

        for (int[] arr : array1) {
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.arraycopy(arr, 0, array2, 0, 1);
            System.arraycopy(arr, 7, array2, 1, 1);
            System.out.println(Arrays.toString(array2));
        }
    }
}
