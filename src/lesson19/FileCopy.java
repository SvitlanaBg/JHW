package lesson19;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("src\\io\\a.txt"));
             BufferedWriter out = new BufferedWriter(new FileWriter("src\\io\\b.txt"))) {
            String a;
            while ((a = in.readLine()) != null) {
                out.write(a);
                out.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
