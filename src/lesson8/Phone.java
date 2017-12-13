package lesson8;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int n, String m, int w) {
        this();
        this.number = n;
        this.model = m;
        this.weight = w;
    }

    Phone() {
        System.out.println("New Phone is created");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;

        Phone phone = (Phone) o;

        if (getNumber() != phone.getNumber()) return false;
        if (getWeight() != phone.getWeight()) return false;
        return getModel() != null ? getModel().equals(phone.getModel()) : phone.getModel() == null;
    }

    @Override
    public int hashCode() {
        int result = getNumber();
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        result = 31 * result + getWeight();
        return result;
    }

    public void receiveCall(String name) {
        System.out.print("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " номер телефона: " + number);
    }
}
