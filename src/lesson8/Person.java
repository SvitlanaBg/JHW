package lesson8;

public class Person {
    private String fullName;
    private int age;

    Person() {
        fullName = "Petrenko Petro";
        age = 12;
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println(getFullName() + " is moving");
    }

    public void talk() {
        System.out.println(getFullName() + " is talking");
    }
}
