package ua.javarush.java.core.level13.task14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Вхідний рядок із датою у форматі ISO (рік-місяць-день)
        String inputDateString = "2024-12-31";

        // Розбираємо рядок у об’єкт LocalDate, явно вказуючи стандартний ISO форматер
        LocalDate parsedLocalDate = LocalDate.parse(inputDateString, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parsedLocalDate);


        // Виводимо отриманий об’єкт дати на екран

    }
}