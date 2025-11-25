package ua.javarush.java.core.level37.task09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Шляхи до файлів: початковий (Windows-1251) і цільовий (UTF-8)
        Path sourceFilePath = Path.of("input-1251.txt");
        Path targetFilePath = Path.of("output-utf8.txt");
        try (var reader = Files.newBufferedReader(sourceFilePath, Charset.forName("Windows-1251"));
             var writer = Files.newBufferedWriter(targetFilePath, StandardCharsets.UTF_8)) {
            String s = "";
            while((s = reader.readLine()) != null){
                writer.write(s);
                writer.newLine();
            }
        }

        // Явно вказуємо кодування для читання й запису


        // try-with-resources гарантує коректне закриття ресурсів

    }
}