package lesson18;

import java.util.SortedSet;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        SortedSet<HeavyBox> set = new TreeSet<>();
        set.add(new HeavyBox(45, 45, 87 ,9));
        set.add(new HeavyBox(65, 58, 82, 82));
        set.add(new HeavyBox(45,32,65,98));
        set.add(new HeavyBox(85,96,87,25));
        set.add(new HeavyBox(24,58,65,55));
        for (HeavyBox heavyBox : set) {
            System.out.println(heavyBox);
        }
    }
}
