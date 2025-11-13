package ua.javarush.java.core.level29.task10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо список playerScores і заповнюємо його у вказаному порядку
        List<Integer> playerScores = Arrays.asList(7, 2, 10, 4, 10, 1);

        // Використовуємо Collections.max і Collections.min для пошуку екстремумів


        // Виводимо максимум і мінімум через пробіл
        int highestScore = Collections.max(playerScores);
        int lowestScore = Collections.min(playerScores);
        System.out.println(highestScore + " " + lowestScore);
    }
}