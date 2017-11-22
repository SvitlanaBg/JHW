package lesson18;
/*
Создать очередь, содержащую объекты класса HeavyBox. Используем класс ArrayDeque.
Поместить объекты в очередь с помощью метода offer(). Удалить объекты методом poll()
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueHeavyBox {
    public static void main(String[] args) {
        HeavyBox box = new HeavyBox(87, 58, 69, 25);
        HeavyBox box1 = new HeavyBox(96, 54, 87, 25);
        HeavyBox box2 = new HeavyBox(25, 74, 89, 65);
        Deque<HeavyBox> boxes = new ArrayDeque<>();
        boxes.offer(box);
        boxes.offer(box1);
        boxes.offer(box2);
        while (!boxes.isEmpty()) {
            System.out.println(boxes.poll());
        }

    }
}
