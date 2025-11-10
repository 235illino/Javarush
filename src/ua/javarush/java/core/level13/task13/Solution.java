package ua.javarush.java.core.level13.task13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Отримуємо сьогоднішню дату як LocalDate
        LocalDate currentReportDate = LocalDate.now();

        

        // Форматуємо дату у стандарт ISO_LOCAL_DATE (наприклад, 2025-06-01)
        String formattedReportDate = currentReportDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(formattedReportDate);


        // Виводимо відформатовану дату

    }
}