package lesson9.com.company;

public class Person {
    private String fulName;
    private int age;

    public Person(String fulName, int age) {
        this.fulName = fulName;
        this.age = age;
    }

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        return getFulName() != null ? getFulName().equals(person.getFulName()) : person.getFulName() == null;
    }

    @Override
    public int hashCode() {
        int result = getFulName() != null ? getFulName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fulName='" + fulName + '\'' +
                ", age=" + age +
                '}';
    }
}
