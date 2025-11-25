package ua.javarush.java.core.level36.task06;

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Ім’я бінарного файла з артефактом
        String fileName = "енергетичний_артефакт.bin";

        long sum = 0; // Сума значень усіх байтів (long, щоб не переповнити int для великих файлів)
        try(FileInputStream fi = new FileInputStream(fileName)){
            int b;
            while((b = fi.read() ) != -1) sum += (b & 0xFF);
        }




        // Якщо файл порожній, сума залишиться 0 — це і є «енергетичний потенціал 0»
        System.out.println(sum);
    }
}