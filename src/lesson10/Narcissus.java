package lesson10;

public class Narcissus extends Flower {
    private static int countFlower;

    public Narcissus(String country, int days, int price) {
        super(country, days, price);
        countFlower++;
    }

    public static int getCountFlower() {
        return countFlower;
    }

    public static void setCountFlower(int countFlower) {
        Narcissus.countFlower = countFlower;
    }

    @Override
    public int price() {
        return getPrice();
    }
}
