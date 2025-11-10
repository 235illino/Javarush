package ua.javarush.java.core.level14.task12;

public class Book {
    private String bookTitle;
    private int numberOfPages;

    public Book() {
        bookTitle = "Без назви";
        numberOfPages = 0;
    }

    public Book(String bookTitle, int numberOfPages) {
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return String.format("Книга: %s, сторінок: %d", bookTitle, numberOfPages);
    }
}
