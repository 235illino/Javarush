package ua.javarush.java.core.level21.task18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо список міст із різною чисельністю населення
        List<City> cities = new ArrayList<>();
        cities.add(new City("Нью-Йорк", 8400000)); // 8,4 млн
        cities.add(new City("Лондон", 8900000));   // 8,9 млн
        cities.add(new City("Париж", 2100000));    // 2,1 млн

        // Сортуємо список стандартним методом Collections.sort
        // Порядок буде за зростанням населення завдяки compareTo у City
        Collections.sort(cities);

        // Виводимо відсортований список
        for (City city : cities) {
            System.out.println(city);
        }
    }
}