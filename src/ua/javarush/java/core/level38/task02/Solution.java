package ua.javarush.java.core.level38.task02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) {
        // try-with-resources автоматично закриє BufferedWriter після використання
        try (var writer = Files.newBufferedWriter(Path.of("output.txt"))) {
            writer.write("Hello, world!");
        } catch (IOException e) {
            System.out.println("Помилка під час запису у файл");
        }

    }
}