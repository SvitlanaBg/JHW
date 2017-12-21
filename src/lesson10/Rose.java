package lesson10;

public class Rose extends Flower {
    private static int countFlower;
    private int priceOfFlower;

    public Rose(String country, int days, int priceOfFlower) {
        super();
        this.priceOfFlower = priceOfFlower;
        countFlower++;
    }

    public Rose(int priceOfflower) {
        this.priceOfFlower = priceOfflower;
    }

    public static int getCountFlower() {
        return countFlower;
    }

    public static void setCountFlower(int countFlower) {
        Rose.countFlower = countFlower;
    }

    public int getPriceOfflower() {
        return priceOfFlower;
    }

    public void setPriceOfflower(int priceOfflower) {
        this.priceOfFlower = priceOfflower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rose)) return false;

        Rose rose = (Rose) o;

        return getPriceOfflower() == rose.getPriceOfflower();
    }

    @Override
    public int hashCode() {
        return getPriceOfflower();
    }

    @Override
    public String toString() {
        return "Rose{" +
                "priceOfflower=" + priceOfFlower +
                '}';
    }

    @Override
    int price() {
        return priceOfFlower;
    }
}
