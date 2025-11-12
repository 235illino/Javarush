package ua.javarush.java.core.level26.task08;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("яблуко", "груша", "яблуко", "слива", "груша");
        // Початковий список із повторами
        Set<String> set = new HashSet<>(list);

        set.forEach(System.out::println);


        // Використовуємо Set для видалення дублікатів.


        // Виводимо підсумковий набір унікальних товарів

    }
}