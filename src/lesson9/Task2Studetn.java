package lesson9;

/**
 * Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
 * Создать переменную типа Student, которая ссылается на объект типа Aspirant.
 */
public class Task2Studetn {
    public static void main(String[] args) {
        Student student = new Student("Борисов", "Борис", "Борисович");
        Aspirant aspirant = new Aspirant("Алексеев", "Алексей", "Алексеевич", "Научная работа №1");
        Student student1=new Aspirant("Бойко","Сергей","Иванович","Научная работа №2");
    }
}
