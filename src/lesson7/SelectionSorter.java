package lesson7;
/**
 * Сделать задание 3 для алгоритма сортировки выбора
 * (Создать табличку для любого массива, в котором последовательно прописать значения i, j, массива для  каждого цикла алгоритма сортировки пузырька.
 * Используйте debugger. Например для массива 0 2 5 3 4:
 */

import java.util.Arrays;

public class SelectionSorter {
    public static void main(String[] args) {
        int[][] data = {
                {0, 2, 5, 3, 4},
                {4, 3, 2, 1, 0},
        };
        for (int[] arr : data) {
            System.out.println(Arrays.toString(arr));
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void sort(int[] array) {
        System.out.println("i " + "j " + "Значение массива  " + "Выполняется ли блок if");
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {    // цикл выбора наименьшего элемента
                char a = '-';
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                    a = '+';
                }
                System.out.println(i + " " + j + " " + Arrays.toString(array) + "     " + a);
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }
}
