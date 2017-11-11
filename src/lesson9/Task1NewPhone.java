package lesson9;

/*
Создать метод sendMessage с аргументами переменной длинны. Данный метод принимает на вход номера телефонов,
которым будут отправлены сообщения. Метод выводит на консоль номера этих телефонов.
Изменить класс Phone в соответствии с концепцией JavaBean.
Реализовать подсчет созданых телефонов с помощью статической переменной.
 */
public class Task1NewPhone {
    static void senMessage(String... arr) {
        System.out.println("Количество телефонов, на которые необходимо отправить сообщение " + arr.length);
        for (String a : arr) {
            System.out.println(a + " ");
        }
    }

    public static void main(String[] args) {
        Phone myPhone = new Phone();
        Phone myPhone1 = new Phone();
        Phone myPhone2 = new Phone();

        myPhone.setModel("Sony");
        myPhone.setNumber("4566123");
        myPhone.setWeight(85);

        myPhone1.setModel("Nokia");
        myPhone1.setNumber("658625");
        myPhone1.setWeight(78);

        myPhone2.setModel("LG");
        myPhone2.setNumber("321456");
        myPhone2.setWeight(87);

        myPhone.receiveCall("Linda", "56485655");
        myPhone1.receiveCall("Marina", "4566125");
        myPhone2.receiveCall("Nil", "789456");


        senMessage("442-34-23",
                "534-54-35",
                "442-43-42",
                "442-34-23",
                "442-33-32",
                "668-54-44");

    }
}
