package ua.javarush.java.core.level30.task04;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Початкові показання датчиків
        List<Integer> readings = List.of(3, 7, 2, 9, 4, 6, 8, 5);
        var oddLabels = readings.stream().filter(x -> x%2 != 0).map(x -> "Odd: " + x).collect(Collectors.toList());

        // Обробляємо показання через Stream API:
        // 1) фільтруємо непарні,
        // 2) перетворюємо на рядки виду "Odd: X",
        // 3) збираємо в новий список


        // Виводимо отриманий список на екран
        System.out.println(oddLabels);
    }
}