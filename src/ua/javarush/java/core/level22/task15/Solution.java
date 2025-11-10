package ua.javarush.java.core.level22.task15;

public class Solution {
    public static void main(String[] args) {
        // Створюємо персонажа з ім’ям "Іван" і віком 25
        Person ivan = new Person("Іван", 25);

        // Викликаємо метод привітання і виводимо результат
        System.out.println(ivan.greeting());
    }
}