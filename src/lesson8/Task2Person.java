package lesson8;

public class Task2Person {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Ivanchenko Ivan", 15);

        System.out.println(person1.fullName + " " + person1.age);

    }
}
