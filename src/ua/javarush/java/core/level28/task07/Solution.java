package ua.javarush.java.core.level28.task07;

import java.util.EnumSet;

public class Solution {
    public static void main(String[] args) {
        // Створюємо EnumSet — спеціальну колекцію для enum-ів
        // Одразу ініціалізуємо лише вихідними днями: субота та неділя
        EnumSet<Day> weekendDays = EnumSet.of(Day.SAT, Day.SUN);

        // Виводимо вміст EnumSet на екран
        System.out.println(weekendDays);
    }
}

// Перелічення з повним набором днів тижня
enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}