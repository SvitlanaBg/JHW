package lesson9.com.company.vehicles;

import lesson9.com.company.details.Engine;
import lesson9.com.company.proffecions.Driver;

public class Car extends Engine {
    private String carClass;
    private Engine engine;
    private Driver driver;
    private String Marka;

    public Car(int power, String company, String carClass, Engine engine, Driver driver, String marka) {
        super(power, company);
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
        Marka = marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;

        Car car = (Car) o;

        if (getCarClass() != null ? !getCarClass().equals(car.getCarClass()) : car.getCarClass() != null) return false;
        if (getEngine() != null ? !getEngine().equals(car.getEngine()) : car.getEngine() != null) return false;
        if (getDriver() != null ? !getDriver().equals(car.getDriver()) : car.getDriver() != null) return false;
        return getMarka() != null ? getMarka().equals(car.getMarka()) : car.getMarka() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getCarClass() != null ? getCarClass().hashCode() : 0);
        result = 31 * result + (getEngine() != null ? getEngine().hashCode() : 0);
        result = 31 * result + (getDriver() != null ? getDriver().hashCode() : 0);
        result = 31 * result + (getMarka() != null ? getMarka().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", Marka='" + Marka + '\'' +
                '}';
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turneLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Марка автомобиля: " + getMarka() + " Класс автомобиля: " + getCarClass());
        System.out.println("ФИО водителя: " + driver.getFulName() + " Возраст: " + driver.getAge() + " Стаж: " + driver.getExperience());
        System.out.println("Мощность мотора: " + engine.getPower() + " Производитель: " + engine.getCompany());
    }
}
