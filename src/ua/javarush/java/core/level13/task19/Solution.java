package ua.javarush.java.core.level13.task19;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Solution {
    public static void main(String[] args) {
        // Поточна дата (береться із системних налаштувань)
        LocalDate today = LocalDate.now();
        LocalDate projectDeadline = LocalDate.of(2025, 5, 15);
        var daysRemaining = ChronoUnit.DAYS.between(projectDeadline, today);
        System.out.println(daysRemaining);
        

        // Дата дедлайну проєкту: 15 травня 2025 року


        // Кількість днів між today і projectDeadline


        // Виводимо результат на екран

    }
}