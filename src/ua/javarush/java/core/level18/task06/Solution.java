package ua.javarush.java.core.level18.task06;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт «розумного» калькулятора
        Multiplier multiplier = new Multiplier();

        // Спочатку множимо два цілих числа
        int intResult = multiplier.multiply(5, 4);

        // Потім множимо два числа з плаваючою крапкою
        double doubleResult = multiplier.multiply(2.5, 3.0);

        // Виводимо результати на екран
        System.out.println(intResult);
        System.out.println(doubleResult);
    }
}