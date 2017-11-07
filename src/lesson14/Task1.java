package lesson14;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Дана строка "Versions: Java 5, Java 6, Java  7, Java 8"
Найти все подстроки "Java X"
*/
public class Task1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java\\s+\\d");
        Matcher str = pattern.matcher("Versions: Java 5, Java 6, Java  7, Java 8");
        //  String [] str=pattern.split("Versions: Java 5, Java 6, Java  7, Java 8");
        while (str.find())
            System.out.println(str.group());
    }

}
