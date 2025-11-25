package ua.javarush.java.core.level21.task07;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо список рядків із фруктами
        List<String> fruits = Arrays.asList( "яблуко", "банан", "груша");
        fruits.sort(String::compareTo);
        fruits.forEach(System.out::println);


        // Сортуємо список за абеткою, використовуючи посилання на метод порівняння рядків


        // Виводимо кожен фрукт з нового рядка

    }
}