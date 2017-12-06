package lesson8;

/**
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk().
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 */
public class Task2Person {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Ivanchenko Ivan", 15);

        System.out.println(person1.getFullName() + " " + person1.getAge());
    }
}
