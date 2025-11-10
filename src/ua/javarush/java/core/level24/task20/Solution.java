package ua.javarush.java.core.level24.task20;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        // try-with-resources: одночасно відкриваємо «читача» і «записувача».
        try (BufferedReader reader = new BufferedReader(new FileReader("ancient_manuscript.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("digital_archive.txt"))){
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Помилка копіювання рукопису!");
        }


        // Читаємо початковий файл построково й одразу записуємо кожен рядок у цільовий



            // Якщо сталася помилка під час читання/запису — виводимо потрібне повідомлення

    }
}