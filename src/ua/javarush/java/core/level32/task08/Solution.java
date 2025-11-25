package ua.javarush.java.core.level32.task08;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Підготовлений список імен
        List<String> potentialNames = Arrays.asList("Іра", "Олег", "Максим", "Таня", "Сергій");

        Random random = new Random();

        // Генеруємо нескінченний потік профілів за допомогою Stream.generate
        // У кожній генерації випадково обираємо ім’я зі списку та вік від 18 до 22

        var demoUserProfiles = Stream.generate(() ->
                potentialNames.get(random.nextInt(0, 5)) + "-" + random.nextInt(18, 23)
        ).distinct().limit(5).collect(Collectors.toList());
        // Виводимо список профілів на екран
        System.out.println(demoUserProfiles);
    }
}