package ua.javarush.java.core.level24.task04;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try {
            // Імітація пошуку звіту: навмисно кидаємо виняток
            throw new FileNotFoundException("Звіт не знайдено!");
        } catch (FileNotFoundException e) {
            // Найбільш специфічний план: файл відсутній
            System.out.println("файл відсутній");

        } catch (IOException e) {
            // Більш загальний план: проблеми введення-виведення
            System.out.println("проблеми введення-виведення");

        } catch (Exception e) {
            // Найзагальніший план: будь-яка інша непередбачена ситуація
            System.out.println("будь-яка інша непередбачена ситуація");

        }
    }
}