package lesson9.com.company.proffecions;

import lesson9.com.company.Person;

public class Driver extends Person {
    private int experience;

    public Driver(String fulName, int age, int experience) {
        super(fulName, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        if (!super.equals(o)) return false;

        Driver driver = (Driver) o;

        return getExperience() == driver.getExperience();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getExperience();
        return result;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                '}';
    }
}
