package ua.javarush.java.core.level36.task10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int wordCount = 0; // змінна для збереження кількості слів
        Path path = Path.of("великий_манускрипт.txt");
        // Використовуємо try-with-resources для автоматичного закриття Scanner
        try(Scanner sc = new Scanner(path.toFile())) {
            while(sc.hasNext()){
                sc.next();
                wordCount++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Виводимо загальну кількість слів на екран
        System.out.println(wordCount);
    }
}