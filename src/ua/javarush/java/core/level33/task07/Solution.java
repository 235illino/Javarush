package ua.javarush.java.core.level33.task07;

import java.util.List;
import java.util.Spliterator;

public class Solution {
    public static void main(String[] args) {
        // Список номерів посилок від 1 до 5
        List<Integer> documentStack = List.of(1, 2, 3, 4, 5);
        var spliterator = documentStack.spliterator();

        // Отримуємо Spliterator у списку


        // Опрацьовуємо лише перший елемент: tryAdvance викликаємо рівно один раз
        // Consumer друкує значення на екран
        spliterator.tryAdvance(System.out::println);
    }
}