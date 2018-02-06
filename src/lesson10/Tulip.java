package lesson10;

public class Tulip extends Flower {
    private static int countFlower;

    public Tulip(String country, int days, int price) {
        super(country, days, price);
        countFlower++;
    }

    public static int getCountFlower() {
        return countFlower;
    }

    public static void setCountFlower(int countFlower) {
        Tulip.countFlower = countFlower;
    }

    @Override
    public int price() {
        return getPrice();
    }
}
