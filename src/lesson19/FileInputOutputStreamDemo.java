package lesson19;
/*
* Переписать класс FileInputOutputStreamDemo: a) Добавить блок try-with-resources.
* б) Замените for (int i = 0; i < c.length; i++) на блок for-each.  в) Пусть file.txt записывается в каталог src/io.
*/

import java.io.*;

public class FileInputOutputStreamDemo {
    public static void main(String args[]) {
        try (OutputStream output = new FileOutputStream("src\\io\\a.txt");
             InputStream input = new FileInputStream("src\\io\\a.txt")) {
            char c[] = {'a', 'b', 'c'};
            for (char aC : c) {
                output.write(aC); // Запись каждого символа в текстовый файл
            }
            int size = input.available();

            for (int j = 0; j < size; j++)
                System.out.print((char) input.read() + " "); // Чтение текстового файла посимвольно
        } catch (IOException e) {
            System.out.print("Exception" + e.getMessage());
        }
    }
}
