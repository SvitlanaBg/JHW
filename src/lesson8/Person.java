package lesson8;

public class Person {
    String fullName;
    int age;

    void move() {
    }

    void talk() {
    }

    Person() {
        fullName = "Petrenko Petro";
        age = 12;
    }

    Person(String fullName, int age) {
        System.out.println(fullName + " " + age);
    }
}
