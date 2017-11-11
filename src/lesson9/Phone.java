package lesson9;

public class Phone {
    private String number, name;
    private String model;
    private int weight;

    private String[] numbersForMessage;

    public Phone() {
    }

    public Phone(String n, String m, int w) {
        this.number = n;
        this.model = m;
        this.weight = w;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


    public String[] getNumbersForMessage() {
        return numbersForMessage;
    }

    public void setNumbersForMessage(String[] numbersForMessage) {
        this.numbersForMessage = numbersForMessage;
    }



    public void receiveCall(String name, String number) {
        System.out.print("Звонит " + name + " " + number);
        System.out.println();
    }


    public static void sendMessage(String... numbersForMessage) {
        System.out.println("Количество ");

        for (String numbers : numbersForMessage) {
            System.out.println(numbersForMessage + " ");
        }
        System.out.println();
    }

}
