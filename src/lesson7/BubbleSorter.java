package lesson7;

import java.util.Arrays;

public class BubbleSorter {
    public static void sort(int[] array) {
        // i - номер прохода
        System.out.println("i " + "j " + "Значение массива " + "Выполняется ли блок if");
        for (int i = 0; i < array.length; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                char a = '-';
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    a = '+';
                }
                System.out.println(i + " " + j + " " + Arrays.toString(array) + "     " + a);
            }
        }
    }
}
