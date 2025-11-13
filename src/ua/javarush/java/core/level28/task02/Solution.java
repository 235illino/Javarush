package ua.javarush.java.core.level28.task02;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо змінюваний список із початковими назвами тварин
        List<String> animals = new ArrayList<>(List.of("cat", "elephant", "dog", "tiger", "rat", "lion"));
        animals.removeIf(x -> x.length() < 4);
        System.out.println(animals);


        // Видаляємо всі рядки, довжина яких менша за 4 символи
        // removeIf приймає умову (Predicate): якщо повертає true — елемент видаляється


        // Виводимо оновлений список після фільтрації

    }
}