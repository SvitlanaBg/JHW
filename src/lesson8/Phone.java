package lesson8;

public class Phone {
    int number;
    String model;
    int weight;

    int getPhoneNumber() {
        return number;
    }

    void receiveCall(String name) {
        System.out.print("Звонит " + name);
    }

    Phone() {
        number = 236653;
        model = "Samsung";
        weight = 95;
    }

    Phone(int n, String m, int w) {
        this.number = n;
        this.model = m;
        this.weight = w;
    }
}
