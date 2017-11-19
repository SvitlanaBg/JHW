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
    /* String login, password, confirmPassword;

     public UserAuthentication(String login, String password, String confirmPassword) {
         this.login = login;
         this.password = password;
         this.confirmPassword = confirmPassword;
     }

     public String getLogin() {
         return login;
     }

     public void setLogin(String login) {
         this.login = login;
     }

     public String getPassword() {
         return password;
     }

     public void setPassword(String password) {
         this.password = password;
     }

     public String getConfirmPassword() {
         return confirmPassword;
     }

     public void setConfirmPassword(String confirmPassword) {
         this.confirmPassword = confirmPassword;
     }
 */
    private static boolean loginConfirmation(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException("Login more than 20 ");
        }
        if (password.length() > 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password more than 20 ");
        }
        return true;
    }

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        loginConfirmation("myLogin", "myPassword", "MyPassword");
        loginConfirmation("myLogin1111", "myPassword", "MyPassword");
        loginConfirmation("myLogin222", "myPassword111111111111111111111111111", "MyPassword11111111111111111111111111111111");
        loginConfirmation("myLoginmyLoginmyLoginmyLoginmyLoginmyLoginmyLoginmyLoginmyLogin", "myPassword", "MyPassword");
    }

}
