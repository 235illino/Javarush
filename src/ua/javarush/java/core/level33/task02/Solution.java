package ua.javarush.java.core.level33.task02;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Початковий список назв заклинань
        List<String> ancientSpells = List.of("Java", "Stream", "API", "IntStream");

        // Перетворюємо Stream<String> на IntStream за допомогою mapToInt,
        // щоб отримати примітивні int (без автоупаковки в Integer),
        // і друкуємо кожну довжину в окремому рядку.
        ancientSpells.stream().mapToInt(String::length).forEach(System.out::println);

    }
}