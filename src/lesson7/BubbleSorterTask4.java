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
        int a = 3;
        int[][] data = {
                {0, 2, 5, 3, 4, 1},
                {5, 6, 8, 2, 1, 7},
        };
        for (int[] arr : data) {
            System.out.println(Arrays.toString(arr));
            sort(arr, a);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void sort(int[] array, int a) {
        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
            if (a == i) {
                break;
            }
        }
    }
}
