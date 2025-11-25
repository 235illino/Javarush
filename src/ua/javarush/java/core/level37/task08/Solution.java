package ua.javarush.java.core.level37.task08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Шлях до тестового файлу
        Path testFilePath = Paths.get("test_encoding.txt");

        // Текст, який зберігаємо в UTF-8
        String multilingualTestMessage = "Тест: Привіт, світе! €";

        // 1) Створюємо/перезаписуємо файл і записуємо рядок у кодуванні UTF-8
        try (var out = Files.newBufferedWriter(testFilePath, StandardCharsets.UTF_8)){
            out.write(multilingualTestMessage);
        }


        // 2) Читаємо файл тричі через Files.newBufferedReader з різними «перекладачами» (кодуваннями)
        var utf8 = StandardCharsets.UTF_8;
        var windows1251 = Charset.forName("Windows-1251");
        var  ISO88591 = StandardCharsets.ISO_8859_1;
        System.out.println(utf8.displayName() + " : " + readAll(testFilePath, utf8));
        System.out.println(windows1251.displayName() + " : " + readAll(testFilePath, windows1251));
        System.out.println(ISO88591.displayName() + " : " + readAll(testFilePath, ISO88591));


    }

    // Построчне читання через Files.newBufferedReader із заданим кодуванням
    private static String readAll(Path path, Charset charset) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
            StringBuilder sb = new StringBuilder();
            String line;
            boolean first = true;
            while ((line = reader.readLine()) != null) {
                // Зберігаємо переноси рядків, якби їх було кілька
                if (!first) sb.append(System.lineSeparator());
                sb.append(line);
                first = false;
            }
            return sb.toString();
        }
    }
}