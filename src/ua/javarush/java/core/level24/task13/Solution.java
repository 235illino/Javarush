package ua.javarush.java.core.level24.task13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        // try-with-resources автоматично закриє файл навіть у разі помилок
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("daily_transactions.txt"))) {
            String s = bufferedReader.readLine();
            if(s == null) throw new NumberFormatException();
            int num = Integer.parseInt(s);
        } catch (FileNotFoundException e) {
            System.out.println("Файл транзакцій не знайдено!");
        } catch (IOException e) {
            System.out.println("Помилка читання даних із файлу!");
        } catch (NumberFormatException e){
            System.out.println("У файлі виявлено некоректні фінансові дані!");
        }
        // Читаємо перший рядок із файлу


        // Порожній файл або відсутність першого рядка вважаємо некоректними даними


        // Намагаємося перетворити рядок на ціле число


        // Успішний сценарій: за умовою нічого не виводимо
        // (можна було б вивести total, але цього не вимагають)

        // Окремий план для ситуації, коли файлу немає

        // Окремий план для некоректних даних у першому рядку

        // Будь-які інші проблеми введення-виведення під час читання файлу

    }
}