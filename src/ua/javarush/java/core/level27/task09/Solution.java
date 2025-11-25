package ua.javarush.java.core.level27.task09;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо список, що містить і цілі, і дробові числа
        List<Number> assets = List.of(1, 2.5, 3);

        // Викликаємо універсальний метод підсумовування і виводимо результат
        double total = sumNumbers(assets);
        System.out.println(total); // очікуємо 6.5
    }

    // Універсальний метод: приймає список будь-яких підтипів Number (wildcard ? extends Number)
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (var num : list){

            sum += num.doubleValue();
        }
        return sum;

        // Проходимо всі числа і підсумовуємо їх як double

    }
}