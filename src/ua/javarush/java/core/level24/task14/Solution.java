package ua.javarush.java.core.level24.task14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        // try-with-resources автоматично закриє файл після роботи
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("game_config.txt"))) {
            String s = bufferedReader.readLine();
            if(s == null) throw new NumberFormatException();
            int num = Integer.parseInt(s);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

                // Читаємо перший рядок налаштувань

            // Якщо рядок відсутній, вважаємо це помилкою формату


            // Перетворюємо рядок на число (може кинути NumberFormatException)


            // Для наочності покажемо завантажене значення


        
        // Один "розумний" catch обробляє відразу два типи проблем:

    }
}