package ua.javarush.java.core.level32.task02;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Початкові дані: ID студента -> список його хобі (незмінні колекції)
        Map<Integer, List<String>> studentHobbyMap = Map.of(
                1, List.of("Плавання", "Шахи"),
                2, List.of("Футбол"),
                3, List.of("Програмування", "Читання", "Кіно")
        );

        // Перетворюємо мапу на потік її записів і "розгортаємо" кожен запис
        // у кілька рядків формату "ID: Хобі" через mapMulti
        var individualHobbyEntries = studentHobbyMap.
                entrySet().
                stream().
                mapMulti((entry, cons) -> {
                            entry.getValue().forEach(hobby -> cons.accept(entry.getKey() + ": " + hobby));
                        }
                ).collect(Collectors.toList());;

        // Вивід результату
        System.out.println(individualHobbyEntries);
    }
}