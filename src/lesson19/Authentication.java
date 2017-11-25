package lesson19;

public class Authentication {
    protected static boolean loginConfirmation(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Login more than 20 ");
            }
            if (password.length() > 20) {
                throw new WrongPasswordException("Password more then 20");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Wrong Password");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.println(login + " " + password + " " + confirmPassword);
        }
        return true;
    }
}
