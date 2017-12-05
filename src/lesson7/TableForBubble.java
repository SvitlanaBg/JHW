package lesson7;

import java.util.Arrays;

/**
 * Создать табличку для любого массива, в котором последовательно прописать значения i, j, массива для  каждого цикла алгоритма сортировки пузырька.
 * Используйте debugger. Например для массива 0 2 5 3 4:
 */

public class TableForBubble {
    public static void main(String[] args) {
        int[][] data = {
                {0, 2, 5, 3, 4},
        };
        for (int[] arr : data) {
            System.out.println(Arrays.toString(arr));
            BubbleSorter.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
