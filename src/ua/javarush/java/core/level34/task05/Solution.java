package ua.javarush.java.core.level34.task05;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // 1) Створюємо змінювану множину рядків
        Set<String> keywords = new HashSet<>();

        // 2) Додаємо три унікальні слова
        keywords.add("spam");
        keywords.add("ads");
        keywords.add("ban");

        // 3) Обгортаємо множину в захисну оболонку (не можна змінювати через це посилання)
        var wrap = Collections.unmodifiableSet(keywords);

        // 4) Намагаємося видалити слово через оболонку та перехоплюємо виняток
        try {
            wrap.remove("spam");
        } catch (Exception e) {
            System.out.println("Помилка: спроба зміни захищеного списку");
        }
    }
}