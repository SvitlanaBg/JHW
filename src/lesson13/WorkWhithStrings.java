package lesson13;

public class WorkWhithStrings {
    public static void main(String[] args) {
        String str1 = "I like Java!!!";
        int lastL = str1.length() - 1;
        char ch = str1.charAt(lastL);
        //for (int i=0;i<str1.length(););
        System.out.println("Последний символ в строке - " + ch);
        System.out.println(str1.endsWith("!!!"));
        System.out.println(str1.startsWith("I like"));
        System.out.println(str1.indexOf("Java"));
        String str2 = str1.replace("a", "o");
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.substring(7, 11));
    }
}
