package ua.javarush.java.core.level26.task09;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо дженерик-колекцію для зберігання книг (каталог)
        List<Book> books = new ArrayList<>();
        books.add(new Book("Awatar", "John Bates"));
        books.add(new Book("Klan Soprano", "Katty Perry"));
        books.forEach(s -> System.out.println(s.getTitle() + " " + s.getAuthor()));
        // Додаємо дві різні книги з різними назвами та авторами


        // Перебираємо каталог і виводимо назву та автора кожної книги

    }
}

// Окремий клас, що представляє книгу: зберігає назву та автора
class Book {
    private final String title;
    private final String author;

    // Конструктор ініціалізує поля книги
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Гетери для доступу до полів
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}