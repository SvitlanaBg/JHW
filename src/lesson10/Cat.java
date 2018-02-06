package lesson10;

public class Cat extends Animal {
    private String bread;
    private String color;

    public Cat(String name, String food, String location, String bread, String color) {
        super(name, food, location);
        this.bread = bread;
        this.color = color;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        if (getBread() != null ? !getBread().equals(cat.getBread()) : cat.getBread() != null) return false;
        return getColor() != null ? getColor().equals(cat.getColor()) : cat.getColor() == null;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "bread='" + bread + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getBread() != null ? getBread().hashCode() : 0);
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        return result;
    }

    @Override
    public void makeNoise() {
    }

    @Override
    public void eat() {
    }
}
