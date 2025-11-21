package ua.javarush.java.core.level36.task09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // try-with-resources автоматично закриє BufferedWriter після завершення блоку
        Path path = Path.of("магічний_камінь.txt");
        try(BufferedWriter bf = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            bf.write("Hello, Java!");
        }
    }
}