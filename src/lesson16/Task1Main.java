package lesson16;

public class Task1Main {
    public static void main(String[] args) {
        Task1<Integer, String, Double> obj = new Task1<>(25, "Price", 12.2);
        obj.showNameClass();
        int o = obj.getObj1();
        System.out.println("value " + o);
        String s = obj.getObj2();
        System.out.println("String " + s);
    }
}
