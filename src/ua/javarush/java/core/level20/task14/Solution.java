package ua.javarush.java.core.level20.task14;

public class Solution {
    public static void main(String[] args) {
        // Лямбда-реалізація: повертає true, якщо число більше 100
        NumberChecker checker = n -> n > 100;

        // Демонстрація роботи на значеннях 50 і 150
        System.out.println(checker.check(50));   // очікуємо false
        System.out.println(checker.check(150));  // очікуємо true
    }
}