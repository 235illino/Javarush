package ua.javarush.java.core.level31.task06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Початковий список екзотичних фруктів
        List<String> fruits = Arrays.asList(
                "Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry"
        );

        // Ділимо фрукти на два кошики за допомогою Stream API і partitioningBy:
        // ключ true — назва починається з 'A', ключ false — усі інші
        var part = fruits.stream().collect(Collectors.partitioningBy(s -> s.startsWith("A")));

        // Виводимо вміст обох кошиків
        System.out.println("Кошик із фруктами на 'A': " + part.get(true));
        System.out.println("Кошик з рештою фруктів: " + part.get(false));
    }
}