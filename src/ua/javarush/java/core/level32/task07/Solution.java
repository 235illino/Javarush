package ua.javarush.java.core.level32.task07;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        // Вихідні дані
        String[] availableColors = {"red", "green", "blue", "yellow"};
        int[] itemCodes = {1, 2, 3};
        int size = Math.min(availableColors.length, itemCodes.length);

        // Беремо мінімальну довжину: зайві елементи мають бути проігноровані


        // "Зіпуємо" масиви за індексом за допомогою IntStream.range
        // Для кожного i формуємо рядок "колір-код" і збираємо у список finalLabels
        var finalLabels = IntStream.range(0, size).mapToObj(i -> availableColors[i] +
                "-" + itemCodes[i]).collect(Collectors.toList());

        // Виводимо отриманий список на екран
        System.out.println(finalLabels);
    }
}