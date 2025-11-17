package ua.javarush.java.core.level31.task04;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Початковий список «магічних слів» у потрібному порядку
        List<String> magicWords = List.of("Java", "Stream", "API");

        // Використовуємо Stream API і метод collect із Collectors.joining(" "),
        // щоб об’єднати слова одним рядком через пробіл
        var spell = magicWords.stream().collect(Collectors.joining(" "));

        // Вимовляємо заклинання вголос — виводимо результат на екран
        System.out.println(spell);
    }
}