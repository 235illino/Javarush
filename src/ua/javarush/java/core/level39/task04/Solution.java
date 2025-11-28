package ua.javarush.java.core.level39.task04;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Створюємо шлях до файлу "info.txt"
        Path path = Path.of("info.txt");
        if(Files.exists(path) && Files.isRegularFile(path)){
            var att = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("Дата створення: " + att.creationTime());
            System.out.println("Дата останньої зміни: " + att.lastModifiedTime());
            System.out.println("Можна читати: " + Files.isReadable(path));
        } else {
            System.out.println("Файл не знайдено");
        }


        // Перевіряємо існування файлу


        // Отримуємо базові атрибути файлу (створення, зміна тощо)


        // Виводимо потрібну інформацію

    }
}