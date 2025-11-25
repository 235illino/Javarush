package ua.javarush.java.core.level17.task06;

// Симулятор зоопарку: демонстрація наслідування та перевизначення методів
public class Solution {
    public static void main(String[] args) {
        // Створюємо собаку й просимо подати голос
        Dog dog = new Dog();
        dog.makeSound(); // Має вивести "Woof!"
    }
}