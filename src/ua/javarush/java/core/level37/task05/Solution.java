package ua.javarush.java.core.level37.task05;

import java.nio.charset.Charset;

public class Solution {
    public static void main(String[] args) {
        // Визначаємо системне кодування за замовчуванням засобами стандартної бібліотеки
        String property = System.getProperty("file.encoding");

        // Виводимо лише значення кодування, без додаткового тексту
        System.out.println(property);

    }
}