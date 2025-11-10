package ua.javarush.java.core.level22.task09;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт книги з довільними значеннями
        Book book = new Book("Чистий код", "Роберт Мартін");

        // Друкуємо об’єкт: буде використано автогенерований toString() запису
        System.out.println(book);
    }
}