package ua.javarush.java.core.level23.task08;

public class Solution {
    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        long value = 5L; // Явно використовуємо тип long

        // Тут Java обере перевантаження print(double),
        demo.print(value); // Очікуваний вивід: "double: 5.0"
    }
}