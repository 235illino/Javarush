package ua.javarush.java.core.level38.task04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Створюємо об’єкт Path, що вказує на папку "backup" у поточному каталозі
        Path backup = Path.of("backup");
        if(!Files.exists(backup)){
            Files.createDirectory(backup);
            System.out.println("Папку створено");
        } else {
            System.out.println("Папка вже існує");
        }


        // Перевіряємо існування папки за допомогою Files.exists(Path)

    }
}