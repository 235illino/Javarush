package ua.javarush.java.core.level35.task04;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) {
        // Шлях до кореневої папки з вихідними файлами (відносний до поточного каталогу запуску)
        Path dir = Paths.get("source_code");
        Path file = Paths.get("Application.java");

        // Ім’я "головного" файла


        // Об’єднуємо шлях до папки з іменем файла через resolve (правильний спосіб з’єднання шляхів)
        Path main = dir.resolve(file);

        // Перетворюємо на абсолютний шлях, щоб збирач бачив повний шлях у системі
        var abs = main.toAbsolutePath();
        System.out.println(abs);

        // Виводимо абсолютний шлях на екран

    }
}