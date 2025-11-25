package ua.javarush.java.core.level35.task02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Працюємо з файлом "my_game_save.dat" у поточній (робочій) директорії
        Path path = Paths.get("my_game_save.dat");
        if(Files.exists(path)){
            System.out.println(String.format("Розмір збереження: %s байт", Files.size(path)));
        } else {
            System.out.println("Файл збереження не знайдено!");
        }


        // Перевіряємо існування і те, що це саме файл, а не тека

    }
}