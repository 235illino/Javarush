package ua.javarush.java.core.level14.task03;

public class Book {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    public void printInfo(){
        System.out.printf("Назва: %s, сторінок: %d", title, pages);
    }
}
