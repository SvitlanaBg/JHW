package lesson13;

public class WorkWithStrings2 {
    public static void main(String[] args) {
        String sNew1, sNew2, sNew3;
        int s1 = 3;
        int s2 = 56;
        StringBuilder s3 = new StringBuilder();
        sNew1 = s3.append(s1).append("+").append(s2).append("=").append(s1 + s2).toString();
        System.out.println(sNew1);
        StringBuilder s4 = new StringBuilder();
        sNew2 = s4.append(s1).append("-").append(s2).append("=").append(s1 - s2).toString();
        System.out.println(sNew2);
    }
}
