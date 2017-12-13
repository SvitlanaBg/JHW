package lesson9;

/**
 * Создать класс Circle, который содержит
 * - переменную radius;
 * - методы, вычисляющие площадь и длину окружности;
 * - константу PI.
 * Создать несколько объектов данного класса.
 */
public class Task6Circle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(12);
        Circle circle2 = new Circle(1);
        Circle circle3 = new Circle(10);

        System.out.println("Площадь круга с радиусом " + circle1.getRadius() + " - " + circle1.sCircle(circle1.getRadius()));
        System.out.println("Длина окружности при радиусе " + circle1.getRadius() + " - " + circle1.lCircle(circle1.getRadius()));
        System.out.println();
        System.out.println("Площадь круга с радиусом " + circle2.getRadius() + " - " + circle2.sCircle(circle2.getRadius()));
        System.out.println("Длина окружности при радиусе " + circle2.getRadius() + " - " + circle2.lCircle(circle2.getRadius()));
        System.out.println();
        System.out.println("Площадь круга с радиусом " + circle3.getRadius() + " - " + circle3.sCircle(circle3.getRadius()));
        System.out.println("Длина окружности при радиусе " + circle3.getRadius() + " - " + circle3.lCircle(circle3.getRadius()));
    }
}
