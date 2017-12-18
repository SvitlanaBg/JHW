package lesson9;

public class Book {
    private String nameOfBook;
    private String authorOfBook;

    public Book(String nameOfBook, String authorOfBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (getNameOfBook() != null ? !getNameOfBook().equals(book.getNameOfBook()) : book.getNameOfBook() != null)
            return false;
        return getAuthorOfBook() != null ? getAuthorOfBook().equals(book.getAuthorOfBook()) : book.getAuthorOfBook() == null;
    }

    @Override
    public int hashCode() {
        int result = getNameOfBook() != null ? getNameOfBook().hashCode() : 0;
        result = 31 * result + (getAuthorOfBook() != null ? getAuthorOfBook().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", authorOfBook='" + authorOfBook + '\'' +
                '}';
    }
}
