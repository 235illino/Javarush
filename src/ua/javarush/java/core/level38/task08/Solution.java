package ua.javarush.java.core.level38.task08;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Створюємо Scanner для зчитування шляху до каталогу з консолі
        Scanner console = new Scanner(System.in);
        String dirPath = console.nextLine().trim();

        // Створюємо об’єкт Path на основі введеного рядка
        Path path = Path.of(dirPath);


        // Перевіряємо, чи доступний каталог для запису
        System.out.println(Files.isWritable(path));



        // Виводимо результат перевірки: true або false

    }
}