package lesson11;

public class Drum implements Instrument {
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drum)) return false;

        Drum drum = (Drum) o;

        return getSize() == drum.getSize();
    }

    @Override
    public int hashCode() {
        return getSize();
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size=" + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет барабан размером " + getSize());
    }
}
