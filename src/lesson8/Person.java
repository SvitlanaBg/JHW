package lesson8;

public class Person {
    private String fullName;
    private int age;

    Person() {
        fullName = "Petrenko Petro";
        age = 12;
    }

    Person(String fullName, int age) {
        System.out.println(fullName + " " + age);
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
}
