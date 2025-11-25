package ua.javarush.java.core.level14.task13;

public class Book {
    private String bookTitle;
    private int pageCount;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
        this.pageCount = 0;
    }

    public Book(String bookTitle, int pageCount) {
        this.bookTitle = bookTitle;
        this.pageCount = pageCount;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
