package ua.javarush.java.core.level38.task09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Створюємо тимчасовий файл у системному каталозі за замовчуванням (безпечне місце)
        // Явно задаємо префікс "temp_" і суфікс ".tmp"
        var temp = Files.createTempFile("temp_", ".tmp");
        var path = temp.toAbsolutePath();
        System.out.println(path);


        // Позначаємо файл на видалення під час завершення роботи JVM
        // (це підкреслює «скороминущість» записки)


        // Виводимо абсолютний шлях до створеного тимчасового файлу

    }
}