package lesson8;

public class Phone {
    private int number;
    private String model;
    private int weight;

    Phone(int n, String m, int w) {
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

    void receiveCall(String name) {
        System.out.print("Звонит " + name);
    }
}
