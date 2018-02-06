package lesson10;

public class Fern extends Flower {
    private static int countFlower;

    public Fern(String country, int days, int price) {
        super(country, days, price);
        countFlower++;
    }

    public static int getCountFlower() {
        return countFlower;
    }

    public static void setCountFlower(int countFlower) {
        Fern.countFlower = countFlower;
    }

    @Override
    public int price() {
        return getPrice();
    }
}
