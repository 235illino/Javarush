package ua.javarush.java.core.level20.task05;

// Невелика демонстрація роботи: створюємо Car і віддаємо команду move()
public class Solution {
    public static void main(String[] args) {
        Movable car = new Car(); // поліморфний тип: звертаємося через інтерфейс
        car.move();              // вивід: Машина їде
    }
}