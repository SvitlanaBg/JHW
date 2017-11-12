package lesson18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorHeavyBox {

    public static void main(String[] args) {
        List<HeavyBox> boxes=new ArrayList<>();
        List<HeavyBox> heavyBoxes=new ArrayList<>();
        HeavyBox box = new HeavyBox(87, 58, 69, 250);
        HeavyBox box1 = new HeavyBox(96, 54, 87, 300);
        HeavyBox box2 = new HeavyBox(25, 74, 89, 650);
        HeavyBox box3 = new HeavyBox(25, 77, 89, 150);
        HeavyBox box4 = new HeavyBox(65, 74, 79, 350);
        boxes.add(box);
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);

        iteratorBox(boxes, heavyBoxes);
        System.out.println(boxes);
        System.out.println(heavyBoxes);
    }

    public static void iteratorBox(List<HeavyBox> boxes, List<HeavyBox> heavyBoxes) {
        Iterator<HeavyBox> iterator=boxes.iterator();
        while (iterator.hasNext()){
            HeavyBox elemetn = iterator.next();
            if (elemetn.getWeight()>300){
                iterator.remove();
                heavyBoxes.add(elemetn);
            }
        }
    }
}
