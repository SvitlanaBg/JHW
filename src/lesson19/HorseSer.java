package lesson19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HorseSer {
    public static void main(String[] args) {
        Halter halter= new Halter("Red", "Cloth");
        Horse horse = new Horse(halter, "Sivka");
        System.out.println(horse.getName()+" "+ halter.getColor()+" "+halter.getMaterial());
        try {
            FileOutputStream hs = new FileOutputStream("src\\io\\horse1.ser");
            ObjectOutputStream os = new ObjectOutputStream(hs);
            os.writeObject(horse);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream hs1 = new FileInputStream("src\\io\\horse1.ser");
            ObjectInputStream os1 = new ObjectInputStream(hs1);
            horse=(Horse) os1.readObject();
            os1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
