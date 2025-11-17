package ua.javarush.java.core.level32.task09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Створюємо список зі значенням null всередині.
        List<String> pets = Arrays.asList("cat", null, "dog");
        System.out.println("Початкові дані: " + pets);


        // Пробуємо "в лоб" привести всі елементи до верхнього регістру.
        // На елементі null відбудеться спроба викликати метод у null -> NullPointerException.

        var upper = pets.stream().map(String::toUpperCase).toList();
        // До цього місця виконання не дійде через виняток.
        System.out.println("Результат: " + upper);
    }
}