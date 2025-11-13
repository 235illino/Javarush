package ua.javarush.java.core.level30.task03;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Початковий список назв предметів
        List<String> items = List.of("apple", "banana", "apricot", "cherry", "avocado");
        var lengths = items.stream().filter(x -> x.startsWith("a")).map(x -> x.length()).collect(Collectors.toList());

        // Обробляємо список за допомогою Stream API:
        // 1) filter — залишаємо рядки, що починаються на 'a'
        // 2) map — замінюємо рядок на його довжину
        // 3) collect — збираємо довжини в новий список


        // Виводимо отриманий список довжин
        System.out.println(lengths);
    }
}