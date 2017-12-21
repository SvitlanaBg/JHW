package lesson10;

public class Narcissus extends Flower {
    private static int countFlower;
    private int priceOfflower;

    public Narcissus(String country, int days, int priceOfflower) {
        super();
        this.priceOfflower = priceOfflower;
        countFlower++;
    }

    public static int getCountFlower() {
        return countFlower;
    }

    public static void setCountFlower(int countFlower) {
        Narcissus.countFlower = countFlower;
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
        if (!(o instanceof Narcissus)) return false;

        Narcissus narcissus = (Narcissus) o;

        return getPriceOfflower() == narcissus.getPriceOfflower();
    }

    @Override
    public int hashCode() {
        return getPriceOfflower();
    }

    @Override
    public String toString() {
        return "Narcissus{" +
                "priceOfflower=" + priceOfflower +
                '}';
    }

    @Override
    int price() {
        return priceOfflower;
    }
}
