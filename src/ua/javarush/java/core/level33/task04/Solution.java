package ua.javarush.java.core.level33.task04;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Список номерів скарбів
        List<Integer> treasures = List.of(10, 15, 20, 25, 30);

        // Лінива обробка:
        // peek друкує лише для справді оброблених елементів,
        // findFirst зупиняє обробку, щойно знайдено перший відповідний елемент
        var artifact = treasures.stream()
                .peek(x -> System.out.println("Перевіряю: " + x))
                .filter(x -> x % 20 == 0)
                .findFirst().orElse(0);

        // Виводимо номер знайденого артефакта
        System.out.println(artifact);
    }
}