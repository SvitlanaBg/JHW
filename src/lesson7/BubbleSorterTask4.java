package lesson7;

import java.util.Arrays;

/**
 * Изменить программу сортировки пузырьком:
 * а) добавить возможность досрочного окончания сортировки;
 * б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
 * Измените программу так чтобы минимальный элемент "всплывал" в конец массива (внутренний цикл for должен перебирать элементы не с конца, а с начала).
 */

public class BubbleSorterTask4 {
    public static void main(String[] args) {
        int[][] data = {
                {0, 2, 5, 3, 4, 1},
                {5, 6, 8, 2, 1, 0},
        };
        for (int[] arr : data) {
            System.out.println(Arrays.toString(arr));
            sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }
    }

    public static void sort(int[] array) {
        int i, j;
        for (i = 0; i < array.length; i++) {
            boolean flag = false;
            for (j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] > array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
