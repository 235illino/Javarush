package ua.javarush.java.core.level23.task06;

public class Solution {
    public static void main(String[] args) {
        // Створюємо обʼєкт собаки
        Dog dog = new Dog();

        // Викликаємо успадкований метод без параметрів (не перевизначений у Dog)
        dog.makeSound(); // Виведе: Some sound

        // Викликаємо перевантажену версію методу з параметром
        dog.makeSound("голосно"); // Виведе: Bark! голосно
    }
}