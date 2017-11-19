package lesson19;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String a) {
        super(a);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}