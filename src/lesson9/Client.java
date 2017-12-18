package lesson9;

import java.util.Arrays;

public class Client {
    private String surname;
    private String name;
    private String patronymic;
    private String cardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Client(String surname, String name, String patronymic, String cardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;

        Client client = (Client) o;

        if (getSurname() != null ? !getSurname().equals(client.getSurname()) : client.getSurname() != null)
            return false;
        if (getName() != null ? !getName().equals(client.getName()) : client.getName() != null) return false;
        if (getPatronymic() != null ? !getPatronymic().equals(client.getPatronymic()) : client.getPatronymic() != null)
            return false;
        if (getCardNumber() != null ? !getCardNumber().equals(client.getCardNumber()) : client.getCardNumber() != null)
            return false;
        if (getFaculty() != null ? !getFaculty().equals(client.getFaculty()) : client.getFaculty() != null)
            return false;
        if (getDateOfBirth() != null ? !getDateOfBirth().equals(client.getDateOfBirth()) : client.getDateOfBirth() != null)
            return false;
        return getPhoneNumber() != null ? getPhoneNumber().equals(client.getPhoneNumber()) : client.getPhoneNumber() == null;
    }

    @Override
    public int hashCode() {
        int result = getSurname() != null ? getSurname().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getPatronymic() != null ? getPatronymic().hashCode() : 0);
        result = 31 * result + (getCardNumber() != null ? getCardNumber().hashCode() : 0);
        result = 31 * result + (getFaculty() != null ? getFaculty().hashCode() : 0);
        result = 31 * result + (getDateOfBirth() != null ? getDateOfBirth().hashCode() : 0);
        result = 31 * result + (getPhoneNumber() != null ? getPhoneNumber().hashCode() : 0);
        return result;
    }

    public void takeBook(int quantity) {
    }

    public void takeBook(String... nameOfBook) {
        System.out.println(Arrays.toString(nameOfBook));
    }

    public void takeBook(Book... books) {
        System.out.println(Arrays.toString(books));
    }

    public void returneBook(int quantity) {
    }

    public void returneBook(String... nameOfBook) {
        System.out.println(Arrays.deepToString(nameOfBook));
    }

    public void returneBook(Book... books) {
        System.out.println(Arrays.deepToString(books));
    }
}
