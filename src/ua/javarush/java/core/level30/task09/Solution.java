package ua.javarush.java.core.level30.task09;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Початковий список зареєстрованих учасників з дублікатами
        List<String> registered = List.of("Анна", "Сергій", "Анна", "Марія", "Іван", "Сергій");
        var uniqueParticipants = registered.stream().collect(Collectors.toSet());
        // Використовуємо Stream API для видалення дублікатів:
        // distinct() залишає лише унікальні елементи в порядку першої появи


        // Виводимо остаточний список унікальних учасників
        uniqueParticipants.forEach(System.out::println);
    }
}