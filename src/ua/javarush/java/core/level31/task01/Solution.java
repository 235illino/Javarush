package ua.javarush.java.core.level31.task01;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Список цін проданих товарів за день
        List<Integer> prices = Arrays.asList(100, 250, 80, 40);

        // Обчислюємо середню ціну через примітивний стрим; якщо список порожній — 0.0
        var average = prices.stream().mapToInt(x -> x).average().orElse(0.0);

        // Знаходимо мінімальну ціну; якщо список порожній — -1
        var min = prices.stream().mapToInt(x -> x).min().orElse(-1);

        // Виводимо результати на екран (кожне значення з нового рядка)
        System.out.println(average);
        System.out.println(min);
    }
}