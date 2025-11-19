package ua.javarush.java.core.level34.task01;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо незмінний список базових кольорів за допомогою List.of
        List<String> colors = List.of("червоний", "синій");

        // Намагаємося додати новий колір до незмінного списку
        try {
            colors.add("зелений");
        } catch (UnsupportedOperationException e) {
            System.out.println("Зміну неможливо: " + e.getClass().getSimpleName());
        }

    }
}