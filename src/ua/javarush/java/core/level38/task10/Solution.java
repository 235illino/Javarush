package ua.javarush.java.core.level38.task10;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Створюємо тимчасовий файл у системному temp-каталозі
        var temp = Files.createTempFile("temp", ".tmp");
        try(var writer = Files.newBufferedWriter(temp)){
            writer.write("Hello, temp!");
        }
        var str = Files.readAllLines(temp);
        Files.deleteIfExists(temp);
        System.out.println("Тимчасовий файл видалено");


        // Пишемо секретне повідомлення у файл.
        // try-with-resources гарантує закриття BufferedWriter навіть у разі помилок.


        // "Читаємо" вміст файла (імітуємо прочитання) — виводити на екран не будемо,
        // щоб не залишати слідів.


        // Негайно видаляємо тимчасовий файл після прочитання


        // Підтверджуємо успішне видалення

    }
}