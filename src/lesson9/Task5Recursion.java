package lesson9;

/**
 * Даны два целых числа A и В.
 * Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае. Использовать рекурсию.
 */
public class Task5Recursion {
    public static void main(String[] args) {
        Recursion rec = new Recursion();
        System.out.println(rec.recurs(12, 23));
        System.out.println(rec.recurs(25, 10));
        System.out.println(rec.recurs(15, 15));
    }
}