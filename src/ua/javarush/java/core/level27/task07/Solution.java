package ua.javarush.java.core.level27.task07;

import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        // Створюємо NavigableMap, щоб швидко знаходити поріг за балами
        NavigableMap<Integer, String> levels = new TreeMap<>();

        // Заповнюємо мапу: ключ — мінімальні бали, значення — назва рівня
        levels.put(1, "бронзовий");
        levels.put(3, "срібний");
        levels.put(5, "золотий");
        levels.put(7, "платиновий");

        // Зчитуємо кількість балів клієнта
        Scanner console = new Scanner(System.in);
        int points = console.nextInt();

        // Знаходимо найбільший ключ, що не перевищує кількість балів
        Integer levelKey = levels.floorKey(points); // ключ найближчого «відповідного» рівня

        // Отримуємо й виводимо назву рівня (якщо порога немає — виводимо повідомлення)
        if (levelKey != null) {
            System.out.println(levels.get(levelKey));
        } else {
            // Якщо балів менше мінімального порога (1), рівня немає
            System.out.println("немає рівня");
        }
    }
}