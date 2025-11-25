package ua.javarush.java.core.level30.task08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Початкові показники з датчиків
        List<Integer> readings = Arrays.asList(10, 15, 20, 25, 30);
        var report = readings.stream()
                .filter(x -> x % 10 == 0)
                .peek(System.out::println)
                .map(Object::toString)
                .collect(Collectors.toList());

        // Будуємо конвеєр обробки:
        // 1) фільтруємо лише кратні 10
        // 2) за допомогою peek виводимо значення, що пройшли фільтр (до перетворення на рядок)
        // 3) перетворюємо числа на рядки
        // 4) збираємо в окремий список


        // Виводимо підсумковий список рядків на екран
        System.out.println(report);
    }
}