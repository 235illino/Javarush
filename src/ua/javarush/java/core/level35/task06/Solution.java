package ua.javarush.java.core.level35.task06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        Path logFile = Path.of("system_log.txt");

        // Підготовлюємо список вигаданих подій для запису у файл
        List<String> events = List.of(
                "Сервер запущено",
                "Користувач увійшов: admin",
                "Помилка бази даних",
                "Резервне копіювання завершено",
                "Службу зупинено"
        );


        Files.write(logFile, events, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        try (var reader = Files.newBufferedReader(logFile)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        // Записуємо події у файл пострічно.


        // Читаємо файл пострічно та виводимо кожен рядок на екран.

    }
}