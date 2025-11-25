package ua.javarush.java.core.level24.task17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        // Використай try-with-resources, щоб потік автоматично закрився
        try(BufferedReader bf = new BufferedReader(new FileReader("article_text.txt"))) {
            var s = bf.readLine();
            System.out.println(s);
        } catch (IOException e) {
            System.out.println("Помилка читання статті!");
        }

        // Прочитай лише перший рядок файлу — заголовок

            // На будь-яку помилку читання виведи повідомлення про помилку


    }
}