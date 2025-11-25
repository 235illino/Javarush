package ua.javarush.java.core.level36.task08;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Вихідний інвентар за типами артефактів
        int[] stockLevels = {10, 20, 30, 40, 50};

        // Ім’я бінарного файла журналу
        String fileName = "інвентарний_журнал.bin";

        // Записуємо дані в бінарний файл за допомогою DataOutputStream
        // Спочатку записуємо кількість типів (довжину масиву), потім усі елементи по порядку
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName))){
            out.writeInt(stockLevels.length);
            for (int stockLevel : stockLevels) {
               out.writeInt(stockLevel);
            }
        }

        // Читаємо дані назад із файла за допомогою DataInputStream
        int[] loaded;
        try(DataInputStream in = new DataInputStream(new FileInputStream(fileName))){
            loaded = new int[in.readInt()];
            for (int i = 0; i < loaded.length; i++) {
                loaded[i] = in.readInt();
            }
        }


        // Виводимо прочитані рівні запасів, розділяючи їх пробілами
        for (int i = 0; i < loaded.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(loaded[i]);
        }
        System.out.println();
    }
}