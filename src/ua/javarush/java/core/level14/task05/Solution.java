package ua.javarush.java.core.level14.task05;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Car із довільними значеннями марки та року випуску
        Car car = new Car("Audi", 2025);
        car.displayDetails();

        // Просимо автомобіль «представитися»

    }
}

// Клас Car зберігає марку і рік випуску та вміє виводити інформацію про себе