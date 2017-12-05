package lesson7;

import java.util.Arrays;

/**
 * Добавить в программу ArrayInverterTest2 еще один тестовый массив.
 * Делаем дебаг и смотрим как работает.
 */

public class ArrayInverterTest {
    public static void main(String[] args) {
        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});
        testInverterChar(new char[]{'q', 'w', 'e', 'a', 's', 'l'});
    }

    private static void testInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        ArrayInverter.invert(array);
        System.out.println(Arrays.toString(array));
    }

    private static void testInverterChar(char[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        ArrayInverter.inverterChar(array);
        System.out.println(Arrays.toString(array));
    }
}
