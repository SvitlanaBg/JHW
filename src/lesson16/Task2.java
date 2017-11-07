package lesson16;

import java.io.Serializable;

public class Task2<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    T obj1;
    V obj2;
    K obg3;

    public static void main(String[] args) {
        Task2<String, Animal, Double> o = new Task2<>();

    }

}
