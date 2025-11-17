package ua.javarush.java.core.level32.task04;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Створюємо незмінний список з назвами планет
        List<String> celestialBodies = List.of("Місяць", "Марс", "Венера");

        // Отримуємо Stream зі списку та об’єднуємо елементи з роздільником " | "
        var joined = celestialBodies.stream().collect(Collectors.joining(" | "));

        // Формуємо підсумковий рядок із заголовком і виводимо на екран
        System.out.println("Планети: " + joined);
    }
}