package lesson10;

/**
 * Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
 * Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep. Dog, Cat, Horse переопределяют методы makeNoise, eat.
 * Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
 * Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
 * Пусть этот метод распечатывает food и location пришедшего на прием животного.
 * В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.
 */
public abstract class Task4Animal {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Chacky", "Meat", "Forest", "Hound", "Grey");
        animals[1] = new Cat("Flafy", "Fish", "House", "Persian", "White");
        animals[2] = new Horse("Sivka", "Grass", "Stable", "Ethiopian horses", "White");

        Veterinarian vet = new Veterinarian();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
