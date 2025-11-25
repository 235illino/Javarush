package ua.javarush.java.core.level30.task05;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Початковий список гостей у порядку черги
        List<String> waiting = List.of("перший", "другий", "третій", "четвертий", "п’ятий");

        // Пропускаємо перших двох (VIP) за допомогою Stream API та методу skip,
        // формуємо новий список із решти гостей
        var regularGuests = waiting.stream().skip(2).toList();

        // Виводимо остаточний список гостей, яким потрібно видати перепустки
        regularGuests.forEach(System.out::println);
    }
}