package ua.javarush.java.core.level30.task06;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Вихідні дані з повторами
        List<Integer> sales = List.of(5, 7, 5, 9, 7, 11, 13, 9, 15);

        // Stream-конвеєр:
        // distinct() — видаляємо дублікати, зберігаючи порядок першої появи
        // limit(4) — залишаємо лише перші чотири унікальні значення
        var top4Unique = sales.stream().distinct().limit(4).toList();

        // Виводимо отриманий список
        System.out.println(top4Unique); // [5, 7, 9, 11]
    }
}