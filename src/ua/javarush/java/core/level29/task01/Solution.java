package ua.javarush.java.core.level29.task01;

import java.util.HashSet;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        // HashSet зберігає лише унікальні елементи за equals/hashCode
        HashSet<City> cities = new HashSet<>();

        // Додаємо два різні об’єкти з однаковими значеннями полів
        cities.add(new City("Метрополіс", 1_000_000));
        cities.add(new City("Метрополіс", 1_000_000)); // дублікат за вмістом

        // Якщо equals/hashCode реалізовано коректно, розмір буде 1
        System.out.println(cities.size());
    }
}