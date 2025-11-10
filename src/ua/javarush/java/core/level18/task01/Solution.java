package ua.javarush.java.core.level18.task01;

// Проста демонстрація поліморфізму: базовий клас Animal і нащадок Dog.
public class Solution {
    public static void main(String[] args) {
        // Змінна базового типу Animal зберігає об’єкт Dog — це і є поліморфізм
        Animal pet = new Dog();

        // Виклик перевизначеного методу: виведе "Гав!"
        pet.makeSound();
    }
}