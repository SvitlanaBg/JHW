package lesson11;

/**
 * Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
 * Интерфейс Инструмент содержит метод play() и клавишу String KEY = "До мажор".
 * Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
 * Создать массив типа Инструмент, содержащий инструменты разного типа.
 * В цикле вызвать метод play() для каждого инструмента, который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".
 */
public class Task4Instrument {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        Drum drum = new Drum(50);
        Trumpet trumpet = new Trumpet(20);
        Instrument[] instruments = new Instrument[3];
        instruments[0] = guitar;
        instruments[1] = drum;
        instruments[2] = trumpet;

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
