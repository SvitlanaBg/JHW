package lesson9.com.company.vehicles;

import lesson9.com.company.details.Engine;
import lesson9.com.company.proffecions.Driver;

public class Lory extends Car {
    private int carrying;

    public Lory(int power, String company, String carClass, Engine engine, Driver driver, String marka, int carrying) {
        super(power, company, carClass, engine, driver, marka);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lory)) return false;
        if (!super.equals(o)) return false;

        Lory lory = (Lory) o;

        return getCarrying() == lory.getCarrying();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getCarrying();
        return result;
    }

    @Override
    public String toString() {
        return "Lory{" +
                "carrying=" + carrying +
                '}';
    }

    public void printInfo() {
        System.out.println("Грузоподьемность кузова: " + this.carrying);
        super.printInfo();
    }
}
