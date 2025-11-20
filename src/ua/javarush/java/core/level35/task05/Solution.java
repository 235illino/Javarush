package ua.javarush.java.core.level35.task05;

import ua.javarush.java.core.level17.task18.Parent;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Імʼя файлу у каталозі запуску програми (відносний шлях)
        String fileName = "encrypted_message.bin";
        var path = Paths.get(fileName);

        // 1) Створюємо файл і записуємо в нього будь-який вміст
        byte[] data = {1, 2, 3, 4, 5};
        Files.write(path, data, StandardOpenOption.CREATE);

        // 2) Читаємо файл побайтно і рахуємо кожен байт
        byte[] allBytes = Files.readAllBytes(path);
        var count = allBytes.length;


        // 3) Виводимо результат у потрібному форматі
        System.out.println("Розмір документа: " + count + " байт");
    }
}