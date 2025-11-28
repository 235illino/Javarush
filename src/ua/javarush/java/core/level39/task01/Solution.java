package ua.javarush.java.core.level39.task01;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) {
        // Створюємо шлях до каталогу "myfolder" (відносно поточного робочого каталогу)
        Path path = Path.of("myfolder");
        try (var all = Files.newDirectoryStream(path)){
            all.forEach(s -> System.out.println(s.getFileName().toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Отримуємо лише безпосередні елементи каталогу через Files.newDirectoryStream(...)
        // try-with-resources гарантує закриття потоку навіть у разі помилки

    }
}