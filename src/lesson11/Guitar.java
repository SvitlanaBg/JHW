package lesson11;

public class Guitar implements Instrument {
    private int quantityOfString;

    public Guitar( int quantityOfString) {
        this.quantityOfString = quantityOfString;
    }

    public int getQuantityOfString() {
        return quantityOfString;
    }

    public void setQuantityOfString(int quantityOfString) {
        this.quantityOfString = quantityOfString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guitar)) return false;

        Guitar guitar = (Guitar) o;

        return getQuantityOfString() == guitar.getQuantityOfString();
    }

    @Override
    public int hashCode() {
        return getQuantityOfString();
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "quantityOfString=" + quantityOfString +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет гитара, количество струн - " + getQuantityOfString());
    }
}
