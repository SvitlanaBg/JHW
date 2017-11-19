package lesson19;

public class Authentication {
    public static void main(String[] args) {

        System.out.println(loginConfirmation("myLogin", "myPassword", "myPassword") + "\n");
        System.out.println(loginConfirmation("myLogin1111", "myPassword", "MyPassword") + "\n");
        System.out.println(loginConfirmation("myLogin222", "myPassword111111111111111111111111111", "MyPassword11111111111111111111111111111111") + "\n");
        System.out.println(loginConfirmation("myLoginmyLoginmyLoginmyLoginmyLoginmyLoginmyLoginmyLoginmyLogin", "myPassword", "MyPassword") + "\n");

    }

    private static boolean loginConfirmation(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Login more than 20 ");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль не верный ");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
     finally {
        System.out.println(login + " " + password + " " + confirmPassword);
    }
        return true;
}

}
