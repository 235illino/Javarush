package ua.javarush.java.core.level29.task09;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо список спостережень тварин
        List<String> animalSightings = new ArrayList<>();
        // Заповнюємо список у потрібному порядку
        animalSightings.add("кіт");
        animalSightings.add("пес");
        animalSightings.add("кіт");
        animalSightings.add("миша");

        // Знаходимо індекс першої появи "кіт" (вбудований метод List)
        var firstIndex = animalSightings.indexOf("кіт");
        var lastIndex = animalSightings.lastIndexOf("кіт");
        // Знаходимо індекс останньої появи "кіт"


        // Виводимо обидва індекси через пробіл
        System.out.println(firstIndex + " " + lastIndex);
    }
}