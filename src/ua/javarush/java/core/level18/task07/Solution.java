package ua.javarush.java.core.level18.task07;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт робота-привітання
        Greetings robot = new Greetings();

        // Привітання за ім’ям
        robot.sayHello("Алекс");

        // Повне привітання за ім’ям і прізвищем
        robot.sayHello("Джон", "Доу");
    }
}