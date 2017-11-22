package lesson19;

/*
Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
Login должен содержать только латинские буквы, цифры и знак подчеркивания.
Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.

Password должен содержать только латинские буквы, цифры и знак подчеркивания.
Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
второй принимает сообщение исключения и передает его в конструктор класса Exception. Обработка исключений проводится внутри метода.
Используем multi-catch block. Метод возвращает true, если значения верны или false в другом случае.
 */
public class UserAuthentication {

    public static void main(String[] args) {

        System.out.println(Authentication.loginConfirmation("myLogin", "myPassword", "myPassword") + "\n");
        System.out.println(Authentication.loginConfirmation("myLogin1111", "myPassword", "MyPassword") + "\n");
        System.out.println(Authentication.loginConfirmation("myLogin222", "myPassword111111111111111111111111111", "MyPassword11111111111111111111111111111111") + "\n");
        System.out.println(Authentication.loginConfirmation("myLoginmyLoginmyLoginmyLoginmyLoginmyLoginmyLoginmyLoginmyLogin", "myPassword", "MyPassword") + "\n");

    }
}
