package lesson12;

/**
 * а) Создать перечисление, содержащее названия времен года.
 * б) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
 * в) Создать метод, который принимает на вход переменную созданного вами enum типа. Если значение равно Лето,
 * выводим на консоль “Я люблю лето” и т.д. Используем оператор switch.
 * г) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
 * д) Добавить конструктор принимающий на вход среднюю температуру.
 * е) Создать метод getDescription, возвращающий строку “Холодное время года”.
 * Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
 * ж) В цикле распечатать все времена года, среднюю температуру и описание времени года.
 */
public class Task1Season {
    public static void main(String[] args) {
        Seasons season = Seasons.SUMMER;
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("Сезон не выбран");
        }
        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons + " " + seasons.getDescription() + " " + seasons.getTemperature());
        }
    }

}
