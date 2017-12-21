package lesson10;

public abstract class Flower {
    private String country;
    private int days;
    private static int countFlower;
    private int priceOfflower;

    public Flower(String country, int days) {
        this.country = country;
        this.days = days;
    }

    public Flower() {
        this.country = country;
        this.days = days;
        this.priceOfflower = priceOfflower;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public static int getCountFlower() {
        return countFlower;
    }

    public static void setCountFlower(int countFlower) {
        Flower.countFlower = countFlower;
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
        if (!(o instanceof Flower)) return false;

        Flower flower = (Flower) o;

        if (getDays() != flower.getDays()) return false;
        if (getPriceOfflower() != flower.getPriceOfflower()) return false;
        return getCountry() != null ? getCountry().equals(flower.getCountry()) : flower.getCountry() == null;
    }

    @Override
    public int hashCode() {
        int result = getCountry() != null ? getCountry().hashCode() : 0;
        result = 31 * result + getDays();
        result = 31 * result + getPriceOfflower();
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "country='" + country + '\'' +
                ", days=" + days +
                ", priceOfflower=" + priceOfflower +
                '}';
    }

    abstract int price();
}
