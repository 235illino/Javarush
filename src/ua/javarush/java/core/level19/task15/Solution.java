package ua.javarush.java.core.level19.task15;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Динамічний список, здатний зберігати об’єкти типу Vehicle (поліморфізм)
        List<Vehicle> vehicles = new ArrayList<>();

        // Додаємо різні види транспорту
        vehicles.add(new Car("Lada"));
        vehicles.add(new Bicycle("Stels"));

        // Проходимо списком і викликаємо move() у кожного транспорту
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}