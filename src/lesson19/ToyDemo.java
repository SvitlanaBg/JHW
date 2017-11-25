package lesson19;

import java.util.*;

public class ToyDemo {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Doll", 34);
        Toy toy2 = new Toy("Car", 54);
        Toy toy3 = new Toy("Box", 45);

        Map<String, Toy> toys = new TreeMap<>();
        toys.put(toy1.getName(), toy1);
        toys.put(toy2.getName(), toy2);
        toys.put(toy3.getName(), toy3);

        iteralEntries(toys);
        iteralKeys(toys);
        tValues(toys);
    }

    public static void tValues(Map<String, Toy> toys) {
        Collection<Toy> collection = toys.values();
        for (Toy value : collection) {
            System.out.println(value);
        }
    }

    public static void iteralKeys(Map<String, Toy> toys) {
        Set<String> set = toys.keySet();
        for (String key : set) {
            System.out.println(key);
            System.out.println(toys.get(key));
        }
    }

    public static void iteralEntries(Map<String, Toy> toys) {
        Set<Map.Entry<String, Toy>> set = toys.entrySet();
        for (Map.Entry<String, Toy> entry : set) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
