package ua.javarush.java.core.level29.task06;

import java.util.Objects;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        // Створюємо два різні об’єкти City з однаковими значеннями полів
        City city1 = new City("Springfield", 100_000);
        City city2 = new City("Springfield", 100_000);

        // TreeSet автоматично сортує елементи й не додає "дублікати"
        // (дублікатом вважається елемент із compareTo == 0)
        TreeSet<City> cities = new TreeSet<>();
        cities.add(city1);
        cities.add(city2);

        // Очікуємо розмір 1, адже міста ідентичні за всіма полями
        System.out.println(cities.size());
    }
}