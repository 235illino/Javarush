package ua.javarush.java.core.level21.task01;

public class Solution {
    public static void main(String[] args) {
        // Використовуємо стандартний функціональний інтерфейс Runnable:
        // у нього немає параметрів і немає поверненого значення.
        Runnable runnable = () -> System.out.println("Лямбда без параметрів!");
        runnable.run();



        // Викликаємо дію — повідомлення буде виведено на екран.

    }
}