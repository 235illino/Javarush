package ua.javarush.java.core.level16.task08;

public class Solution {
    public static void main(String[] args) {
        // Створюємо книгу через статичний вкладений клас Builder
        Book book = new Book.Builder()
                .setTitle("Java Basics")
                .setPages(500)
                .build();

        // Виводимо інформацію про книгу (toString() повертає рядок у потрібному форматі)
        System.out.println(book);
    }
}