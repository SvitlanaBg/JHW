package lesson7;

import java.util.Arrays;

/**
 * Создать двумерный массив типа char размером 4х2.
 * И записать туда значения с помощью блока для инициализации.
 * Распечатать значения массива с помощью метода Arrays.deepToString(m).
 */

public class CharArray {
    public static void main(String[] args) {
        char array[][] = {
                {'q', 'w'},
                {'a', 's'},
                {'z', 'c'},
                {'v', 'r'}
        };
        System.out.println(Arrays.deepToString(array));
    }
}
