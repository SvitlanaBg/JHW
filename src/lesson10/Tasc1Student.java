package lesson10;

/**
 * Создать метод getScholarship() для класса Student. Переопределить его в классе Aspirant. Создать массив типа Student,
 * содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.
 */
public class Tasc1Student {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Борисов", "Борис", "Борисович");
        students[1] = new Aspirant("Алексеев", "Алексей", "Алексеевич", "Научная работа №1");
        students[2] = new Aspirant("Бойко", "Сергей", "Иванович", "Научная работа №2");
        for (Student student : students) {
            student.getScholarship();
        }
    }
}
