package lesson18;
/*
Напишите методы union(Set<?> set1, Set<?> set2) и intersect(Set<?> set1, Set<?> set2), реализующих операции объединения и пересечения двух множеств.
Протестируйте работу этих методах на двух предварительно заполненных множествах.
(Вам понадобится написать вспомогательный метод, выводящий все элементы множества в консоль).
 */
import java.util.HashSet;
import java.util.Set;

public class Equipments {
    public static void main(String[] args) {

        Set<String> equipmentsSet1 = new HashSet<>();
        Set<String> equipmentsSet2 = new HashSet<>();

        equipmentsSet1.add("Ball");
        equipmentsSet1.add("Jumping-rope");
        equipmentsSet1.add("Rope");
        equipmentsSet1.add("Mat");
        equipmentsSet1.add("Dumbbel");

        equipmentsSet2.add("Dumbbel");
        equipmentsSet2.add("Weight");
        equipmentsSet2.add("Cycle");
        equipmentsSet2.add("Mat");

        System.out.println(equipmentsSet1);
        System.out.println(equipmentsSet2);

        System.out.println(union(equipmentsSet1, equipmentsSet2));

        System.out.println(intersect(equipmentsSet1, equipmentsSet2));

    }

    public static Set<String> union(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static Set<String> intersect(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }
}

