package lesson10;

public class Fern extends Flower {
    private static int countFlower;
    private int priceOfflower;

    public Fern(String country, int days, int priceOfflower) {
        super();
        this.priceOfflower = priceOfflower;
        countFlower++;
    }

    public Fern(int priceOfflower) {
        this.priceOfflower = priceOfflower;
    }

    public static int getCountFlower() {
        return countFlower;
    }

    public static void setCountFlower(int countFlower) {
        Fern.countFlower = countFlower;
    }

    public int getPriceOfflower() {
        return priceOfflower;
    }

    public void setPriceOfflower(int priceOfflower) {
        this.priceOfflower = priceOfflower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fern)) return false;

        Fern fern = (Fern) o;

        return getPriceOfflower() == fern.getPriceOfflower();
    }

    @Override
    public int hashCode() {
        return getPriceOfflower();
    }

    @Override
    public String toString() {
        return "Fern{" +
                "priceOfflower=" + priceOfflower +
                '}';
    }

    @Override
    int price() {
        return priceOfflower;
    }
}
