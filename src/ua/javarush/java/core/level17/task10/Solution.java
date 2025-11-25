package ua.javarush.java.core.level17.task10;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Car: спочатку спрацює конструктор Vehicle (через super),
        // потім — виведення з конструктора Car
        Car car = new Car("BMW", 2023);
    }
}