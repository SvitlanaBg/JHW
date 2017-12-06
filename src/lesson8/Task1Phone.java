package lesson8;

/**
 * Класс Phone. (Задание с урока)
 * a) Создайте класс Phone, который содержит переменные number, model и weight.
 * б) Создайте три экземпляра этого класса.
 * в) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 * Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 * г) Добавить конструктор в класс Phone, который принимает на вход параметры для инициализации переменных класса.
 * д) Добавить конструктор без параметров.
 * е) Вызвать из конструктора с параметрами конструктор по умолчанию.
 * ж) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
 */
public class Task1Phone {
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
    }
}
