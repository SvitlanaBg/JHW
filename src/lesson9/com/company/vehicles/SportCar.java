package lesson9.com.company.vehicles;

import lesson9.com.company.details.Engine;
import lesson9.com.company.proffecions.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar(int power, String company, String carClass, Engine engine, Driver driver, String marka, double speed) {
        super(power, company, carClass, engine, driver, marka);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportCar)) return false;
        if (!super.equals(o)) return false;

        SportCar sportCar = (SportCar) o;

        return Double.compare(sportCar.getSpeed(), getSpeed()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getSpeed());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }

    public void printInfo() {
        System.out.println("Предельная скорость: " + this.speed);
        super.printInfo();
    }
}
