package lesson11;

/**
 * а) Определить интерфейс Printable, содержащий метод void print().
 * б) Определить класс Book, реализующий интерфейс Printable.
 * в) Определить класс Magazine, реализующий интерфейс Printable.
 * г) Создать массив типа Printable, который будет содержать книги и журналы.
 * д) В цикле пройти по массиву и вызвать метод print() для каждого объекта.
 * е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.
 * Создать статический метод printBooks(Printable[] printable)в классе Book, который выводит на консоль названия только книг.
 * Используем оператор instanceof.
 */
public class Task1Printable {
    public static void main(String[] args) {
        Book book = new Book();
        Magazine magazine = new Magazine();
        Printable printables[] = new Printable[2];
        printables[0] = book;
        printables[1] = magazine;

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
