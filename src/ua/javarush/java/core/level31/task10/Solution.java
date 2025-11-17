package ua.javarush.java.core.level31.task10;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Приклад вхідних даних: список цілих показників портфеля
        List<Integer> indicators = List.of(12, -3, 7, 18, 0, -4, 10);

        // Одночасно рахуємо суму та середнє за допомогою advanced‑колектора Collectors.teeing
        // Перший колектор — сума (summingInt), другий — середнє (averagingInt)
        // Третій аргумент — функція обʼєднання результатів в обʼєкт Result
        var result = indicators.stream().collect(Collectors.teeing(
                Collectors.summingInt(Integer::intValue),
                Collectors.averagingDouble(Integer::doubleValue),
                Result::new
        ));

        // Виводимо обидва значення з обʼєкта Result
        System.out.println(result.totalSum);
        System.out.println(result.averageValue);
    }
}

// Окремий клас для охайного зберігання результатів
class Result {
    // Повна сума всіх елементів
    public final int totalSum;
    // Середнє арифметичне всіх елементів
    public final double averageValue;

    // Конструктор використовується як функція обʼєднання в Collectors.teeing
    Result(int totalSum, double averageValue) {
        this.totalSum = totalSum;
        this.averageValue = averageValue;
    }
}