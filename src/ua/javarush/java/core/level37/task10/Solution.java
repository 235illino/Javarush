package ua.javarush.java.core.level37.task10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) {
        // Шляхи до файлів: вихідний (ISO-8859-1) і цільовий (UTF-8)
        String inputDataPath = "input_iso_8859_1.txt";
        String outputDataPath = "output_utf8.txt";

        // Явно задаємо вихідне та цільове кодування
        // try-with-resources гарантує закриття файлів навіть у разі помилок
        try (var read = Files.newBufferedReader(Path.of(inputDataPath), StandardCharsets.ISO_8859_1);
             var out = Files.newBufferedWriter(Path.of(outputDataPath), StandardCharsets.UTF_8)) {
            String s;
            while((s = read.readLine()) != null){
                out.write(s);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Помилка під час перекодування файлу");
        }




    }
}