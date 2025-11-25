package ua.javarush.java.core.level22.task05;

public class Solution {
    public static void main(String[] args) {
        // Створюємо екземпляр запису для улюбленої книги
        Book favoriteBook = new Book("Effective Java", "Joshua Bloch");

        // Виводимо всю інформацію про книгу: назву та автора
        System.out.println("Назва: " + favoriteBook.title());
        System.out.println("Автор: " + favoriteBook.author());
    }
}