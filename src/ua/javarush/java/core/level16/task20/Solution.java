package ua.javarush.java.core.level16.task20;

public class Solution {

    // Публічний статичний (вкладений) клас з утилітарним методом
    public static class DevUtils {
        public static <T> void printTwice(T value) {
            System.out.println(value);
            System.out.println(value);
        }
        // Універсальний метод з узагальненням: приймає параметр будь-якого типу T

    }

    public static void main(String[] args) {
        // Демонстрація універсальності: рядок і число
        DevUtils.printTwice("Java");
        DevUtils.printTwice(100);
    }
}