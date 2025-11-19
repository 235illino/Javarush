package ua.javarush.java.core.level34.task04;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Створюємо змінювану мапу (робочі налаштування)
        Map<String, Integer> devSettings = new HashMap<>();
        devSettings.put("одна", 1);
        devSettings.put("дві", 2);
        devSettings.put("три", 3);

        // Робимо "релізну" незмінювану копію поточних налаштувань
        // Важливо: це незалежна копія, яку не можна змінювати
        var releaseSettings = Map.copyOf(devSettings);


        // Перевіряємо незмінюваність: спроба додати елемент має кинути виняток
        try {
            releaseSettings.put("чотири", 4);
        } catch (UnsupportedOperationException e) {
            System.out.println("Помилка: мапа незмінювана");
        }
        devSettings.put("одна", 100);
        // У процесі розробки змінюємо початкові налаштування
        

        // Друкуємо обидві мапи, щоб показати незалежність копії
        System.out.println("Робоча мапа: " + devSettings);
        System.out.println("Релізна мапа: " + releaseSettings);
    }
}