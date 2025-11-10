package ua.javarush.java.core.level24.task09;

public class Solution {
    public static void main(String[] args) {
        // Створюємо "першопричину" — уже наявний виняток
        Throwable rootCause = new NullPointerException("дані відсутні!");

        // Створюємо наш виняток і "прикріплюємо" до нього першопричину
        DataProcessingFailure failure = new DataProcessingFailure("Помилка створення звіту", rootCause);

        // Виводимо на екран першопричину через getCause()
        // Очікуємо побачити NullPointerException з тим самим повідомленням
        System.out.println(failure.getCause());
    }
}