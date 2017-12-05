package lesson19;


import java.io.Serializable;

public class Horse extends Animal {
    private Halter halter;
    private String name;

    public Horse(Halter halter, String name) {
        this.halter = halter;
        this.name = name;
    }

    public Halter getHalter() {
        return halter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "halter=" + halter +
                ", name='" + name + '\'' +
                '}';
    }
}
