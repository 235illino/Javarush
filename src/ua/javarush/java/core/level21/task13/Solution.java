package ua.javarush.java.core.level21.task13;

public class Solution {
    public static void main(String[] args) {
        // Викликаємо static-метод безпосередньо через ім’я інтерфейсу — без створення об’єктів
        System.out.println(StringChecker.isEmpty(""));     // true
        System.out.println(StringChecker.isEmpty("Java")); // false
    }
}