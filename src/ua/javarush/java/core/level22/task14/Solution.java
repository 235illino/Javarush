package ua.javarush.java.core.level22.task14;

public class Solution {
    public static void main(String[] args) {
        // 1) Коректний email — створюємо і виводимо
        Email good = new Email("student@example.com");
        System.out.println("Створено коректну адресу: " + good.address());

        // 2) Некоректний email — без символа '@'
        // Цей рядок викине IllegalArgumentException із повідомленням із конструктора і завершить програму
        Email bad = new Email("student.example.com");

        // До цього рядка виконання не дійде
        System.out.println(bad.address());
    }
}