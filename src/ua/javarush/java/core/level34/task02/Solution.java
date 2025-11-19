package ua.javarush.java.core.level34.task02;

import java.awt.*;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        // Демонстрація заборони null у незмінних списках List.of
        try {
            List<String> animals = List.of("кіт", null, "собака");
        } catch (NullPointerException e) {
            System.out.println("Null заборонено: " + e.getClass().getSimpleName());
        }

        // Демонстрація заборони дублікатів у незмінних множинах Set.of
        try {
            Set<String> planets = Set.of("сонце", "місяць", "сонце");
        } catch (IllegalArgumentException e) {
            System.out.println("Дублікати заборонені: " + e.getClass().getSimpleName());
        }
    }
}