package ua.javarush.java.core.level38.task03;

import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Path, що вказує на каталог "data" у поточному (робочому) каталозі
        Path dir = Path.of("data");
        if (Files.exists(dir) && Files.isDirectory(dir)) {
            System.out.println("Каталог знайдено");
        } else {
            System.out.println("Каталог не знайдено");
        }


        // Перевіряємо, що шлях існує і це саме каталог (а не файл)


        // Виводимо результат перевірки

    }
}