package ua.javarush.java.core.level36.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Path scrollPath = Paths.get(("древний_свиток.txt"));

        // Зчитуємо лише перший рядок — заголовок/основну думку сувою
        try (BufferedReader bf = Files.newBufferedReader(scrollPath, StandardCharsets.UTF_8)) {
            String s = bf.readLine();
            if (s != null)
                System.out.println(s);
        }


        // Виводимо її на екран (якщо файл порожній, нічого не буде виведено)

    }
}