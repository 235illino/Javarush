package ua.javarush.java.core.level21.task05;

import java.util.function.IntFunction;

public class Solution {
    public static void main(String[] args) {
        // Створюємо "конвертер" через посилання на статичний метод Integer.toHexString(int)

        IntFunction<String> fun = Integer::toHexString;
        System.out.println(fun.apply(255));

        // Застосовуємо конвертер до числа 255


        // Виводимо шістнадцяткове представлення на екран

    }
}