package ua.javarush.java.core.level38.task07;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Зчитуємо шлях до файлу як текстовий рядок
        Path path = Path.of(console.nextLine());
        System.out.println(Files.isReadable(path));


        // Створюємо обʼєкт Path на основі введеного рядка


        // Перевіряємо право на читання файлу за допомогою Files.isReadable(Path)


        // Виводимо результат перевірки: true або false

    }
}