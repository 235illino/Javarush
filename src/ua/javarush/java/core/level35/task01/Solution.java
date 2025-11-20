package ua.javarush.java.core.level35.task01;

import java.io.File;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт File, що представляє файл "дневник.txt" у поточному каталозі
        File file = new File("дневник.txt");
        if(file.exists()){
            System.out.println("Файл знайдено!");
        } else {
            System.out.println("Файл не знайдено!");
        }


        // Перевіряємо існування файлу за допомогою методу exists()

    }
}