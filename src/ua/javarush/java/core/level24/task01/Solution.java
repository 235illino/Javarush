package ua.javarush.java.core.level24.task01;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        // Створюємо дві «проблеми»: мережеву (IOException) і зникнення даних (NullPointerException)
        IOException networkProblem = new IOException();
        NullPointerException missingDataError = new NullPointerException();
        System.out.println(networkProblem.getClass().getSuperclass().getSimpleName());
        System.out.println(missingDataError.getClass().getSuperclass().getSimpleName());

        // Для кожного винятку отримуємо безпосередній клас-батько через рефлексію


        // Виводимо імена батьківських класів

    }
}