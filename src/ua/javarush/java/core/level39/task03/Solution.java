package ua.javarush.java.core.level39.task03;

import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт шляху, що вказує на "example" відносно поточної директорії
        var path = Path.of("example");
        if(Files.exists(path) && (Files.isRegularFile(path) || Files.isDirectory(path))){
            if(Files.isRegularFile(path)){
                System.out.println("Це файл");
            } else if(Files.isDirectory(path)){
                System.out.println("Це папка");
            }
        } else {
            System.out.println("Не знайдено");
        }


        // Перевіряємо існування об’єкта за шляхом

    }
}