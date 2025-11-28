package ua.javarush.java.core.level39.task08;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Зчитуємо шлях до директорії, яку потрібно видалити повністю
        Scanner console = new Scanner(System.in);
        System.out.println("Введи шлях до директорії, яку потрібно видалити повністю:");
        String input = console.nextLine().trim();

        Path root = Paths.get(input);

        // Невелика перевірка вхідних даних — щоб програма коректно завершувалася
        if (!Files.exists(root)) {
            System.out.println("Вказаний шлях не існує: " + root.toAbsolutePath());
            return;
        }
        if (!Files.isDirectory(root)) {
            System.out.println("Це не директорія: " + root.toAbsolutePath());
            return;
        }

        // Обхід дерева за допомогою SimpleFileVisitor:
        // - visitFile: видаляємо кожен файл
        // - postVisitDirectory: після видалення всіх вкладених елементів видаляємо саму папку
        try {
            Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Files.delete(file); // видаляємо файл
                    System.out.println("Видалено: " + file.toAbsolutePath());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    Files.delete(dir); // видаляємо папку після того, як видалили все всередині
                    System.out.println("Видалено: " + dir.toAbsolutePath());
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}