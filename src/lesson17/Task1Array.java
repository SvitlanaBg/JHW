package lesson17;

import java.util.ArrayList;
import java.util.List;

public class Task1Array {
    public static void main(String[] args) {
        List<HeavyBox> arr = new ArrayList<>();
        HeavyBox box = new HeavyBox();
        arr.add(box);
        arr.add(new HeavyBox());
        arr.add(new HeavyBox());
        arr.add(new HeavyBox());
        arr.add(new HeavyBox());
        for (HeavyBox i : arr) {
            System.out.println(i);
        }
    }
}
