package lesson10;

/**
 * Создать класс "Flower", который содержит переменные страна производитель и срок хранения в днях.
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
 * Суперкласс "Flower" должен содержать абстрактный метод определяющий стоимость цветка, этот метод переопределить в классах наследниках.
 * Собрать 3 букета (используем массив) с определением их стоимости. В букет может входить несколько цветов разного типа.
 * Также подсчитать количество проданных цветов (используем статический метод).
 */
public class Task3Bouquet {
    public static void main(String[] args) {
        int price = 0;
        int i;

        Flower[] bouquet1 = new Flower[5];
        bouquet1[0] = new Tulip("Ukraine", 25, 10);
        bouquet1[1] = new Tulip("Ukraine", 25, 10);
        bouquet1[2] = new Tulip("Ukraine", 25, 10);
        bouquet1[3] = new Narcissus("Ukraine", 25, 8);
        bouquet1[4] = new Narcissus("Ukraine", 25, 8);

        Flower[] bouquet2 = new Flower[4];
        bouquet2[0] = new Rose("China", 50, 7);
        bouquet2[1] = new Rose("China", 50, 7);
        bouquet2[2] = new Rose("China", 50, 7);
        bouquet2[3] = new Fern("China", 50, 5);

        Flower[] bouquet3 = new Flower[6];
        bouquet3[0] = new Narcissus("Ukraine", 25, 8);
        bouquet3[1] = new Narcissus("Ukraine", 25, 8);
        bouquet3[2] = new Narcissus("Ukraine", 25, 8);
        bouquet3[3] = new Fern("China", 50, 5);
        bouquet3[4] = new Fern("China", 50, 5);
        bouquet3[5] = new Fern("China", 50, 5);

        for (Flower bouquet : bouquet1) {
            price += bouquet.price();
        }
        System.out.println("Стоимость букета №1: " + price);

        for (Flower bouquet : bouquet2) {
            price += bouquet.price();
        }
        System.out.println("Стоимость букета №2: " + price);

        for (Flower bouquet : bouquet3) {
            price += bouquet.price();
        }
        System.out.println("Стоимость букета №3: " + price);

        System.out.println();
        System.out.println("Количество роз: " + Rose.getCountFlower() + " шт.");
        System.out.println("Количество папоротника: " + Fern.getCountFlower() + " шт.");
        System.out.println("Количество тюльпанов: " + Tulip.getCountFlower() + " шт.");
        System.out.println("Количество нарциссов: " + Narcissus.getCountFlower() + " шт.");

    }
}
