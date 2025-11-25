package ua.javarush.java.core.level35.task09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Відносний шлях від поточного робочого каталогу до річної папки
        Path path = Path.of("data/reports/2024");
        Files.createDirectories(path);
        System.out.println(path.toAbsolutePath());

        // Створюємо весь ланцюжок каталогів одразу.
        // Якщо деякі папки вже існують — помилки не буде.


        // Отримуємо абсолютний шлях до найглибшої папки ("2024") та виводимо його

    }
}