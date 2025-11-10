package ua.javarush.java.core.level13.task15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт LocalDate з датою 15 березня 2023 року
        LocalDate specificEventDate = LocalDate.of(2023, 3, 15);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String friendlyDisplayDateString = specificEventDate.format(dateTimeFormatter);
        System.out.println(friendlyDisplayDateString);


        // Готуємо форматер із шаблоном "dd.MM.yyyy" (наприклад, "15.03.2023")


        // Форматуємо дату в рядок з урахуванням заданого шаблону


        // Виводимо отриманий рядок на екран

    }
}