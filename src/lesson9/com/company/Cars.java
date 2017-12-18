package lesson9.com.company;

import lesson9.com.company.details.Engine;
import lesson9.com.company.proffecions.Driver;
import lesson9.com.company.vehicles.Lory;
import lesson9.com.company.vehicles.SportCar;

/**
 * Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в пакете com.company.professions.
 * Класс Driver содержит поля - ФИО, стаж вождения.
 * Класс Engine содержит поля - мощность, производитель.
 * Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
 * Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
 * А также метод printInfo(), который выводит полную информацию об автомобиле, ее водителе и моторе.
 * Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
 * Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью. Пусть класс Driver расширяет класс Person.
 */
public class Cars {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Petrenko I.V.", 35, 10);
        Driver driver2 = new Driver("Krotenko S.T.", 46, 12);
        Driver driver3 = new Driver("Stepanenko B.B.", 50, 17);

        Engine engine1 = new Engine(120, "BMW");
        Engine engine2 = new Engine(130, "Toyota");
        Engine engine3 = new Engine(225, "Tavria");

        Lory truck1 = new Lory(12, "BMW", "Truck", engine1, driver1, "BMW-Truck", 5);

        SportCar sportCar1 = new SportCar(10, "Tavria", "Sport Car", engine3, driver3, "Tavria Sport 217", 180);

        System.out.println("Автомобиль №1");
        truck1.start();
        truck1.stop();
        truck1.turneLeft();
        truck1.turnRight();
        truck1.printInfo();

        System.out.println();
        System.out.println("Автомобиль №2");
        sportCar1.printInfo();
    }
}
