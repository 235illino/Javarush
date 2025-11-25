package ua.javarush.java.core.level13.task18;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Поточна дата
        LocalDate today = LocalDate.now();


        // Контрольна дата: 1 січня 2025 року
        LocalDate futureMilestone = LocalDate.of(2025, 1 , 1);


        // Використовуємо isBefore: якщо futureMilestone раніше за today, отже 2025 вже настав
        if(futureMilestone.isBefore(today)) System.out.println("2025 вже настав");
        else System.out.println("2025 ще не настав");

    }
}