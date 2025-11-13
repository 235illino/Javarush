package ua.javarush.java.core.level29.task05;

public class Book implements Comparable<Book>{
    private final String bookTitle;
    private final int publicationYear;

    public Book(String bookTitle, int publicationYear) {
        this.bookTitle = bookTitle;
        this.publicationYear = publicationYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public int compareTo(Book o) {
        var year = Integer.compare(this.publicationYear, o.publicationYear);
        if(year != 0) return year;
        return this.bookTitle.compareTo(o.bookTitle);
    }
}
