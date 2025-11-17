package ua.javarush.java.core.level31.task03;

import java.util.List;
import java.util.Optional;

public class Solution {
    public static void main(String[] args) {
        // Початковий список температур за тиждень
        List<Integer> temperatures = List.of(7, 3, 15, 2, 9);
        var min = temperatures.stream().reduce((a,b) -> Math.max(a,b));

        // Шукаємо максимум через Stream API і reduce.
        // Використовуємо варіант без identity, щоб при порожньому списку отримати Optional.empty,
        // а не кидати виняток.
        System.out.println(min.orElse(0));

        // Виводимо результат лише якщо дані є

    }
}