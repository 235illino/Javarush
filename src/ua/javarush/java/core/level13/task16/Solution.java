package ua.javarush.java.core.level13.task16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Початковий рядок із міткою часу замовлення
        String orderTimestampString = "01.06.2025 14:30";




        // Створюємо форматер із шаблоном "dd.MM.yyyy HH:mm"
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");


        // Парсимо рядок в об’єкт LocalDateTime
        LocalDateTime parsedOrderDateTime = LocalDateTime.parse(orderTimestampString, dateTimeFormatter);


        // Виводимо результат у стандартному ISO-форматі (наприклад, 2025-06-01T14:30)
        System.out.println(parsedOrderDateTime);

    }
}