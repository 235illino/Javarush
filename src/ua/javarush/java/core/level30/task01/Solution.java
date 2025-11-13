package ua.javarush.java.core.level30.task01;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Створюємо послідовність рівнів як масив цілих чисел
        int[] levels = {1, 2, 3, 4, 5};

        // Перетворюємо масив на потік і обробляємо кожен елемент окремо за допомогою forEach
        Arrays.stream(levels).forEach(System.out::println);
    }
}