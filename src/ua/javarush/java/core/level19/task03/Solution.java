package ua.javarush.java.core.level19.task03;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Колекція, здатна зберігати об’єкти типу Vehicle (поліморфізм)
        List<Vehicle> vehicles = new ArrayList<>();

        // Додаємо по одному об’єкту Car і Bicycle
        vehicles.add(new Car());
        vehicles.add(new Bicycle());

        // Проходимося колекцією і "оживляємо" транспорт, викликаючи move()
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}