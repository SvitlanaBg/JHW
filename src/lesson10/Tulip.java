package lesson10;

public class Tulip extends Flower {
    private static int countFlower;
    private int priceOfflower;

    public Tulip(int priceOfflower) {
        super();
        this.priceOfflower = priceOfflower;
    }

    public Tulip(String country, int days, int priceOfflower) {
        super();
        this.priceOfflower = priceOfflower;
        countFlower++;
    }

    public static int getCountFlower() {
        return countFlower;
    }

    public static void setCountFlower(int countFlower) {
        Tulip.countFlower = countFlower;
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
        if (!(o instanceof Tulip)) return false;

        Tulip tulip = (Tulip) o;

        return getPriceOfflower() == tulip.getPriceOfflower();
    }

    @Override
    public int hashCode() {
        return getPriceOfflower();
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "priceOfflower=" + priceOfflower +
                '}';
    }

    @Override
    int price() {
        return priceOfflower;
    }
}
