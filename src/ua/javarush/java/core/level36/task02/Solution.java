package ua.javarush.java.core.level36.task02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Назва файлу з умови. За потреби можна замінити на "output.txt".
        Path file = Path.of("аннали_істини.txt");

        // Записуємо рівно один рядок без символу нового рядка наприкінці
        try(BufferedWriter bw = Files.newBufferedWriter(file, StandardCharsets.UTF_8, StandardOpenOption.CREATE)) {
            bw.write("Java is awesome!");
        }

    }
}