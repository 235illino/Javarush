package ua.javarush.java.core.level21.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Початковий список результатів спортсменів
        List<Integer> list = Arrays.asList(-5, 3, -2, 7, 0);
        list.sort(Comparator.comparingInt(Math::abs));
        list.forEach(System.out::println);


        // Компаратор-лямбда: порівнюємо числа лише за їхнім абсолютним значенням (знак ігнорується)


        // Сортуємо список за зростанням абсолютної величини


        // Виводимо відсортований список

    }
}