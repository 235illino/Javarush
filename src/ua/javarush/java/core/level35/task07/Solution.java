package ua.javarush.java.core.level35.task07;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Шлях до файлу журналу
        Path logFile = Paths.get("application_activity.log");

        // Текст події, яку потрібно додати
        String event = "Нова подія зафіксована.";
        Files.write(logFile, List.of(event), StandardOpenOption.CREATE, StandardOpenOption.APPEND);

        // Відкриваємо файл у режимі дозапису і створюємо його за відсутності

    }
}