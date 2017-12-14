package lesson9;

public class Recursion {
    private int result;

    public int recurs(int a, int b) {
        if (a < b) {
            System.out.print(a++ + " ");
        }
        if (a > b) {
            System.out.print(a-- + " ");
        }
        if (a == b) return a;
        result = recurs(a, b);
        return result;
    }
}
