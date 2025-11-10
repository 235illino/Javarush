package ua.javarush.java.core.level18.task18;

// Задача: абстрактний клас Animal і його нащадок Dog, який реалізує makeSound()
public class Solution {
    public static void main(String[] args) {
        // Демонструємо поліморфізм: змінна базового типу посилається на об’єкт підкласу
        Animal pet = new Dog();
        pet.makeSound(); // Очікуваний вивід: "Гав-гав!"
    }
}