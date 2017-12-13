package lesson9;

public class Recursion {
    int recurs(int a, int b) {
        int result;
        if (a < b) {
            System.out.print(a + " ");
            a++;
        }
        if (a > b) {
            System.out.print(a + " ");
            a--;
        }
        if (a == b) return a;
        result =
                recurs(a, b);
        return result;
    }
}
