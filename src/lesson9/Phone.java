package lesson9;

public class Phone {
    private int number;
    private String model;
    private int weight;
    private static int count = 0;


    public Phone(int n, String m, int w) {
        this();
        this.number = n;
        this.model = m;
        this.weight = w;
    }

    public Phone() {
        System.out.println("New Phone is created");
        count++;
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

    public static int getCount() {
        return count;
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
        if (!(o instanceof lesson8.Phone)) return false;

        lesson8.Phone phone = (lesson8.Phone) o;

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

    public void sendMessage(int... array) {
        System.out.println("Номера телефонов для отправки сообщений:");
        for (int a : array) {
            System.out.println(a + " ");
        }
        System.out.println();
    }

    protected void finalize() {
        count--;
    }
}
