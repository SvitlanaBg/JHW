package lesson10;

abstract public class Shapes {
    private String color;

    public Shapes(String color) {
        this.color = color;
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
        if (!(o instanceof Shapes)) return false;

        Shapes shapes = (Shapes) o;

        return getColor() != null ? getColor().equals(shapes.getColor()) : shapes.getColor() == null;
    }

    @Override
    public int hashCode() {
        return getColor() != null ? getColor().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "color='" + color + '\'' +
                '}';
    }

    abstract void drow();

}
