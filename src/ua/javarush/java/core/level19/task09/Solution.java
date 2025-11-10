package ua.javarush.java.core.level19.task09;

public class Solution {
    public static void main(String[] args) {
        // Поліморфізм: змінна типу Vehicle посилається на об’єкт Car
        Vehicle car = new Car();

        // Виклик перевизначеного методу move() у машини
        car.move(); // Очікуваний вивід: "Машина їде"
    }
}