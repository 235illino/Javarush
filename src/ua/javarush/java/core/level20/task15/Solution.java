package ua.javarush.java.core.level20.task15;

import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        // Предикат перевіряє, що довжина рядка більша за 5 символів
        Predicate<String> predicate = s -> s.length() > 5;


        // Демонстрація роботи на двох прикладах
        System.out.println(predicate.test("Java"));
        System.out.println(predicate.test("FunctionalInterface"));
    }
}