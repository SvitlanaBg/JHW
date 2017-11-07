package lesson8;

public class Task1Phone {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        Phone myPhone1 = new Phone();
        Phone myPhone2 = new Phone();

        myPhone.model = "Sony";
        myPhone.number = 4566123;
        myPhone.weight = 85;

        myPhone1.model = "Nokia";
        myPhone1.number = 658625;
        myPhone1.weight = 78;

        myPhone2.model = "LG";
        myPhone2.number = 321456;
        myPhone2.weight = 87;

        String name, name1, name2;
        name = "Linda";
        name1 = "Maria";
        name2 = "Larisa";

        myPhone.receiveCall(name);
        System.out.println(" " + myPhone.getPhoneNumber());

        myPhone1.receiveCall(name1);
        System.out.println(" " + myPhone1.getPhoneNumber());

        myPhone2.receiveCall(name2);
        System.out.println(" " + myPhone2.getPhoneNumber());
    }
}
