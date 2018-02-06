package lesson10;

public abstract class Flower {
    private String country;
    private int days;
    private static int countFlower;
    private int price;

    public Flower(String country, int days, int price) {
        this.country = country;
        this.days = days;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;

        Flower flower = (Flower) o;

        if (getDays() != flower.getDays()) return false;
        if (getPrice() != flower.getPrice()) return false;
        return getCountry() != null ? getCountry().equals(flower.getCountry()) : flower.getCountry() == null;
    }

    @Override
    public int hashCode() {
        int result = getCountry() != null ? getCountry().hashCode() : 0;
        result = 31 * result + getDays();
        result = 31 * result + getPrice();
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "country='" + country + '\'' +
                ", days=" + days +
                ", price=" + price +
                '}';
    }

    abstract public int price();
}
