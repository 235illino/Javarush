package ua.javarush.java.core.level36.task03;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        try {
            Path file = Paths.get("епічна_сага.txt");
            String res = Files.readString(file);
            res = res.replaceAll("\r|\n", "");

            // Читаємо вміст файлу повністю як один рядок у UTF-8
            System.out.println(res);


            // Видаляємо всі перенесення рядка (\r і \n), щоб отримати безперервний текст


            // Виводимо результат на екран

        } catch (IOException e) {
            // У разі помилки читання або якщо файл не знайдено — виводимо інформацію про виняток
            e.printStackTrace();
        }
    }
}