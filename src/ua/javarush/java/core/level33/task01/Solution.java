package ua.javarush.java.core.level33.task01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        // Масив сум окремих продажів за день
        int[] dailySalesFigures = {10, 20, 30, 40, 50};

        // Примітивний стрім IntStream (без boxing) + термінальна операція sum()
        var total = Arrays.stream(dailySalesFigures).sum();

        // Виводимо підсумкову суму виручки
        System.out.println(total);
    }
}