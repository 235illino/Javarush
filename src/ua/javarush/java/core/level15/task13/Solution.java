package ua.javarush.java.core.level15.task13;

public class Solution {
    public static void main(String[] args) {
        // Отримуємо значення статичного поля через ім’я класу (об’єкт не створюємо)
        // Поле приватне, тому звертаємося до нього через публічний статичний геттер
        System.out.println(ApplicationMetrics.getActiveUserCount());
    }
}