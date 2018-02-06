package lesson10;

public class Rose extends Flower {
    private static int countFlower;

    public Rose(String country, int days, int price) {
        super(country, days, price);
        countFlower++;
    }

    public static int getCountFlower() {
        return countFlower;
    }

    public static void setCountFlower(int countFlower) {
        Rose.countFlower = countFlower;
    }

    @Override
    public int price() {
        return getPrice();
    }
}
