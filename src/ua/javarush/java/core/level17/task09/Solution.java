package ua.javarush.java.core.level17.task09;

// У цьому завданні демонструємо перевизначення методу і виклик базової реалізації через super.
public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт собаки і викликаємо її метод makeSound()
        Dog dog = new Dog();
        dog.makeSound();
    }
}