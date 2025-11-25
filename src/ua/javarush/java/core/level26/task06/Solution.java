package ua.javarush.java.core.level26.task06;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        // TreeMap автоматично підтримує сортування ключів за абеткою (природний порядок String)
        Map<String, Integer> fruits = new TreeMap<>();
        fruits.put("pear", 6);
        fruits.put("apple", 2);
        fruits.put("banana", 4);

        for (var entry : fruits.entrySet()){
            System.out.println(String.format("Фрукт: %s, Кількість: %d", entry.getKey(), entry.getValue()));
        }

        // Додаємо дані про фрукти


        // Проходимо по записах: порядок вже абетковий завдяки TreeMap

    }
}