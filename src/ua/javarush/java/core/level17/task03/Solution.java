package ua.javarush.java.core.level17.task03;

public class Solution {
    public static void main(String[] args) {
        // Створюємо автомобіль, який успадковує поведінку від Vehicle
        Car car = new Car();

        // Вказуємо модель автомобіля
        car.vehicleModel = "Lada";

        // Запускаємо автомобіль: має вивести "Lada заводиться."
        car.start();
    }
}