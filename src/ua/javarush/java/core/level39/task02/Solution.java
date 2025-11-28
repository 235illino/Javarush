package ua.javarush.java.core.level39.task02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        // Задаємо кореневий каталог "src" через Path (вимога задачі)
        var dir = Path.of("src");
        try (var paths = Files.walk(dir)){
            paths.filter(s -> Files.isRegularFile(s))
                    .filter(path -> path.toString().endsWith(".java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Рекурсивно проходимо всі підкаталоги за допомогою Files.walk
        // Використовуємо try-with-resources, щоб коректно закрити потік шляхів

    }
}