package ua.javarush.java.core.level22.task06;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт record-класу з іменем і віком
        HistoricalFigure figure = new HistoricalFigure("Леонардо да Вінчі", 67);

        System.out.println("Початкові дані: " + figure);
        System.out.println("Ім’я: " + figure.name() + ", вік: " + figure.age());

        // Спроба 1: пряме присвоювання полю (як у звичайному класі)
        //figure.name = "Мікеланджело"; // Помилка: поля record приватні й final, прямий доступ неможливий.

        // Спроба 2: виклик сетера (як у звичайному класі)
        //figure.setName("Мікеланджело"); // Помилка: у record немає сетерів, такого методу не існує.

        // Об’єкт лишається незмінним
        System.out.println("Після «спроб зміни» об’єкт не змінився: " + figure);
    }
}