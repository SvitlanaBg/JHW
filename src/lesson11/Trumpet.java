package lesson11;

public class Trumpet implements Instrument {
    private int diameter;

    public Trumpet(int diameter) {

        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trumpet)) return false;

        Trumpet trumpet = (Trumpet) o;

        return getDiameter() == trumpet.getDiameter();
    }

    @Override
    public int hashCode() {
        return getDiameter();
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + getDiameter());
    }
}
