package ua.javarush.java.core.level22.task03;

public class Solution {
    public static void main(String[] args) {
        // Створюємо два об’єкти City з абсолютно однаковими значеннями
        City city1 = new City("Paris", 2148327);
        City city2 = new City("Paris", 2148327);

        // У record equals автоматично згенерований і порівнює компоненти за значенням
        boolean areEqual = city1.equals(city2);

        // Виводимо результат порівняння: true або false
        System.out.println(areEqual);
    }
}