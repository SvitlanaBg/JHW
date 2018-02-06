package lesson10;

public class Dog extends Animal {
    private String bread;
    private String color;

    public Dog(String name, String food, String location, String bread, String color) {
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
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        if (getBread() != null ? !getBread().equals(dog.getBread()) : dog.getBread() != null) return false;
        return getColor() != null ? getColor().equals(dog.getColor()) : dog.getColor() == null;
    }

    @Override
    public String toString() {
        return "Dog{" +
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
