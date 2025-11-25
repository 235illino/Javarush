package ua.javarush.java.core.level38.task01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        // Намагаємося відкрити файл "missing.txt" за допомогою FileReader.
        // Використовуємо try-with-resources, щоб гарантувати закриття ресурсу.
        try(FileReader fr = new FileReader("missing.txt")){

        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено");
        } catch (IOException e) {
            System.out.println("Помилка введення-виведення");
        }

    }
}