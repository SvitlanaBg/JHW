package lesson18;
/*
Создать динамический массив, содержащий объекты класса HeavyBox. Раcпечатать его содержимое используя for each.
Создать TreeSet содержащий HeavyBox. HeavyBox должен реализовать интерфейс Comparable. Распечатать содержимое с помощью for each.
 */

import java.util.SortedSet;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        SortedSet<HeavyBox> set = new TreeSet<>();
        set.add(new HeavyBox(45, 45, 87, 9));
        set.add(new HeavyBox(65, 58, 82, 82));
        set.add(new HeavyBox(45, 32, 65, 98));
        set.add(new HeavyBox(85, 96, 87, 25));
        set.add(new HeavyBox(24, 58, 65, 55));
        for (HeavyBox heavyBox : set) {
            System.out.println(heavyBox);
        }
    }
}
