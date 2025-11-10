package ua.javarush.java.core.level14.task13;

public class Solution {
    public static void main(String[] args) {
        // Реєструємо книгу, у якої поки є лише назва
        Book book1 = new Book("Загадковий роман");
        Book book2 = new Book("Подорож космосом", 500);
        System.out.println(book1.getBookTitle());
        System.out.println(book1.getPageCount());
        System.out.println(book2.getBookTitle());
        System.out.println(book2.getPageCount());

        // Реєструємо книгу з назвою і кількістю сторінок


        // Виводимо значення полів для обох книг (по черзі: назва, потім кількість сторінок)

    }
}

// "Форма" для книги: зберігає назву і кількість сторінок