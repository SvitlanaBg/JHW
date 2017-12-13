package lesson9;

import lesson9.Phone;

/**
 * Создать метод sendMessage с аргументами переменной длинны. Данный метод принимает на вход номера телефонов,
 * которым будут отправлены сообщения. Метод выводит на консоль номера этих телефонов.
 * Изменить класс Phone в соответствии с концепцией JavaBean.
 * Реализовать подсчет созданых телефонов с помощью статической переменной.
 */
public class Task1NewPhone {
    public static void main(String[] args) {
        Phone myPhone = new Phone(4566123, "Sony", 85);
        Phone myPhone1 = new Phone(658625, "Nokia", 78);
        Phone myPhone2 = new Phone(321456, "LG", 87);

        String name, name1, name2;
        name = "Linda";
        name1 = "Maria";
        name2 = "Larisa";

        myPhone.receiveCall(name);
        System.out.println(" " + myPhone.getNumber());

        myPhone1.receiveCall(name1);
        System.out.println(" " + myPhone1.getNumber());

        myPhone2.receiveCall(name2);
        System.out.println(" " + myPhone2.getNumber());

        myPhone.receiveCall(name, myPhone.getNumber());
        myPhone1.receiveCall(name1, myPhone1.getNumber());
        myPhone2.receiveCall(name2, myPhone2.getNumber());

        myPhone.sendMessage(myPhone1.getNumber(), myPhone2.getNumber(), 7845124, 5648714);

        System.out.println("Количество созданых телефонов: " + Phone.getCount());

        System.gc();
    }
}
