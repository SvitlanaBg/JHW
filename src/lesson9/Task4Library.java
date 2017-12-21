package lesson9;

/**
 * Определить класс, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон.
 * Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса.
 * В программе организовать: ввод данных о читателях,  вывод информации о читателях. Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг.
 * - takeBook, который будет принимать переменное количество названий книг.
 * - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс).
 * Аналогичным образом перегрузить метод returnBook().
 */
public class Task4Library {
    public static void main(String[] args) {
        Book book1 = new Book("Java: Полное руководство", "Герберт Шилдт");
        Book book2 = new Book("Думай как математик", "Барбара Окли");
        Book book3 = new Book("Экономическая теория", "Куликов");
        Book book4 = new Book("Oracle PL/SQL", "Нанда");
        Book book5 = new Book("MySQL. Библиотека профессионала", "Аткинсон");

        Client client1 = new Client("Петренко", "Антон", "Иванович", "QW0001", "Экономический", "21.12.2001", "0984561245");
        Client client2 = new Client("Ревко", "Николай", "Александрович", "QW0002", "Экономический", "12.01.2001", "0854785124");
        Client client3 = new Client("Санина", "Анна", "Игоревна", "QW0003", "Экономический", "15.07.1999", "0984561236");
        Client client4 = new Client("Харченко", "Ольга", "Петровна", "SQ0001", "Физико-математический", "30.09.1999", "0965321245");
        Client client5 = new Client("Хорошева", "Екатерина", "Антоновна", "SQ0002", "Физико-математический", "12.09.2001", "0236548978");
        Client client6 = new Client("Харченко", "Андрей", "Антонович", "SQ0003", "Физико-математический", "11.11.2000", "0945698521");

        Client[] clients = new Client[]{client1, client2, client3, client4, client5, client6};

        client1.takeBook(book1, book2);
        client2.takeBook(book3.getNameOfBook(), book4.getNameOfBook());

        client3.returneBook(book4, book5);
        client4.returneBook(book3.getNameOfBook(), book2.getNameOfBook());

        client5.takeBook(15);
        client6.returneBook(10);
    }
}
