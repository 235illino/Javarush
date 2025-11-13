package ua.javarush.java.core.level29.task05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо динамічний список для зберігання книжок
        List<Book> catalog = new ArrayList<>();

        // Додаємо три книжки; у двох — однаковий рік видання, але різні назви
        catalog.add(new Book("Структури даних", 2000));
        catalog.add(new Book("Алгоритми", 2000));
        catalog.add(new Book("Компілятори", 1990));



        // Сортуємо список згідно з логікою compareTo у класі Book
        Collections.sort(catalog);

        // Виводимо назви книжок у порядку після сортування
        for (Book book : catalog) {
            System.out.println(book.getBookTitle());
        }
    }
}