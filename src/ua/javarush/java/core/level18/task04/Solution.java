package ua.javarush.java.core.level18.task04;

public class Solution {
    public static void main(String[] args) {
        // Формуємо колону транспорту для параду: масив базового типу Vehicle
        // Поліморфізм: хоча масив Vehicle[], фактично в ньому різні нащадки
        Vehicle[] parade = {
                new Car(),
                new Bicycle(),
                new Scooter() // новий тип транспорту додано без зміни логіки обходу
        };

        // Єдиний код обходу — для кожного елемента викликаємо move()
        // Завдяки перевизначенню в кожного типу буде свій вивід
        for (Vehicle v : parade) {
            v.move();
        }
    }
}