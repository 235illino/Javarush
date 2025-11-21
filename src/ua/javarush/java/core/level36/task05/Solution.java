package ua.javarush.java.core.level36.task05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Початковий масив байтів зразка даних
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8};

        // Назва вихідного бінарного файлу
        String fileName = "цінний_фрагмент.bin";

        // Записуємо рівно 4 байти, починаючи з індексу 2 (елементи 3, 4, 5, 6)
        // Використовуємо спеціалізований метод write(byte[], int offset, int length)
        try(FileOutputStream fo = new FileOutputStream(fileName)) {
            fo.write(data, 2, 4);
        }

    }
}