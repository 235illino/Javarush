package ua.javarush.java.core.level13.task20;

import java.time.LocalDate;
import java.time.Period;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт LocalDate для дати зведення будівлі: 20 березня 2000 року
        LocalDate constructionDate = LocalDate.of(2000, 3, 20);

        
        // Отримуємо поточну дату
        LocalDate today = LocalDate.now();

        
        // Обчислюємо повний період між датою зведення та сьогоднішнім днем
        var buildingAgePeriod = Period.between(constructionDate, today);

        
        // Форматуємо та виводимо результат у форматі "Вік: X років, Y місяців, Z днів"
        System.out.printf("Вік: %d років, %d місяців, %d днів", buildingAgePeriod.getYears(), buildingAgePeriod.getMonths(), buildingAgePeriod.getDays());

    }
}