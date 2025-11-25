package ua.javarush.java.core.level18.task09;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт собаки — нашого мешканця зоопарку
        Dog dog = new Dog();

        // Просимо собаку видати звук.
        // Має бути виведений перевизначений варіант: "Гав!"
        dog.makeSound();
    }
}