package ua.javarush.java.core.level39.task10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Зчитуємо шлях до файлу з клавіатури
        Scanner console = new Scanner(System.in);
        System.out.println("Введи шлях до файлу:");
        String input = console.nextLine().trim();

        Path path = Paths.get(input);

        try {
            // Читаємо поточне значення часу модифікації для наочності та перевірки
            FileTime before = Files.getLastModifiedTime(path);

            // Встановлюємо поточний системний час як час останньої модифікації
            // (FileTime належить до пакета java.nio.file.attribute)
            FileTime now = FileTime.from(Instant.now());
            Files.setLastModifiedTime(path, now);

            // Зчитуємо значення після оновлення безпосередньо з файлової системи
            FileTime after = Files.getLastModifiedTime(path);

            // Проста перевірка успішності: значення після операції відрізняється від початкового
            // (у деяких ФС точність часової мітки може бути грубішою за мілісекунди)
            boolean updated = !after.equals(before);

            // Виводимо нове (актуальне) значення. FileTime виводить ISO-8601 в UTC.
            System.out.println("Нове значення часу останньої модифікації (UTC): " + after);
            System.out.println(updated ? "Статус: оновлено успішно." :
                    "Статус: час не змінився (можливі обмеження точності/прав доступу).");
        } catch (IOException e) {
            // Для навчального завдання обмежимося коротким повідомленням
            System.out.println("Помилка під час оновлення метаданих: " + e.getMessage());
        }
    }
}