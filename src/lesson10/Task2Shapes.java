package lesson10;

/**
 * Создайте суперкласс Shape и его наследники Circle, Rectangle.
 * Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 * Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры.
 * В цикле нарисовать их (вызвать метод draw). Добавить метод equals()  для классов Shape, Circle, Rectangle. (Задание с урока)
 */
public class Task2Shapes {
    public static void main(String[] args) {
        Shapes[] shapes = new Shapes[3];
        shapes[0] = new Circle("Зеленый", 12, 18);
        shapes[1] = new Rectangle("Черный", 45, 45, 90, -95);
        shapes[2] = new Circle("Красный", 0, 1);
        for (Shapes shape : shapes) {
            shape.drow();
        }
    }

}
