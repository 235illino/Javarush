package ua.javarush.java.core.level39.task07;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Зчитуємо шлях до кореневого каталогу з консолі
        Scanner console = new Scanner(System.in);
        String root = console.nextLine();

        Path start = Paths.get(root);

        // Обходимо файлову систему за допомогою FileVisitor (через SimpleFileVisitor)
        // Files.walkFileTree рекурсивно пройде по всіх вкладених каталогах
        Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                if (file.getFileName().toString().toLowerCase(Locale.ROOT).endsWith(".txt")) {
                    System.out.println("Знайдено .txt файл: " + file.toAbsolutePath());
                }
                return FileVisitResult.CONTINUE;
            }
        });

      
    }
}