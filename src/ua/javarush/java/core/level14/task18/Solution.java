package ua.javarush.java.core.level14.task18;

public class Solution {
    public static void main(String[] args) {
        // Створюємо книгу зі стандартними значеннями полів
        Book standardBook = new Book();

        // Виводимо стандартні значення на екран
        System.out.println(standardBook.bookTitle);
        System.out.println(standardBook.pageCount);
    }
}

// "Шаблон" книги з початковими значеннями полів прямо під час оголошення