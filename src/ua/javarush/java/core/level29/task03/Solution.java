package ua.javarush.java.core.level29.task03;

public class Solution {
    public static void main(String[] args) {
        // Створюємо книгу з конкретною назвою й автором
        Book book = new Book("Clean Code", "Robert C. Martin");

        // Виводимо обчислений хеш-код об’єкта Book
        System.out.println(book.hashCode());
    }
}