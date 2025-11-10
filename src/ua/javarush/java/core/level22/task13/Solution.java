package ua.javarush.java.core.level22.task13;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт температури за значенням у Фаренгейтах (212°F — кипіння води)
        Temperature boiling = Temperature.fromFahrenheit(212);

        // Виводимо значення в градусах Цельсія
        System.out.println(boiling.celsius());
    }
}