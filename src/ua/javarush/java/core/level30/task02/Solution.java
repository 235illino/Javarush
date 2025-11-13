package ua.javarush.java.core.level30.task02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Початковий список категорій у нижньому регістрі
        List<String> categories = Arrays.asList("java", "stream", "api");
        var uppercased = categories.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        // Перетворюємо кожен елемент у верхній регістр за допомогою Stream API
        // і збираємо результат у НОВИЙ список (вихідний список лишається без змін).


        // Виводимо новий список на екран
        System.out.println(uppercased);
    }
}