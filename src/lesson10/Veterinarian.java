package lesson10;

public class Veterinarian {
    public Veterinarian() {
    }

    @Override
    public String toString() {
        return "Veterinarian{}";
    }

    public void treatAnimal(Animal animal) {
        System.out.println("Пациент " + animal.getName() + " " + animal.getFood() + " " + animal.getLocation());
    }
}
