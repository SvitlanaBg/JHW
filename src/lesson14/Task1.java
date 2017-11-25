package lesson14;
/* Дана строка "Versions: Java 5, Java 6, Java  7, Java 8"
*Найти все подстроки "Java X"
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java\\s+\\d");
        Matcher str = pattern.matcher("Versions: Java 5, Java 6, Java  7, Java 8");
        while (str.find())
            System.out.println(str.group());
    }
}
