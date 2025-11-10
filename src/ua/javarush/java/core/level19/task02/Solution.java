package ua.javarush.java.core.level19.task02;

public class Solution {
    public static void main(String[] args) {
        // Демонстрація роботи: поліморфний виклик makeSound()
        Animal dog = new Dog();
        dog.makeSound(); // Очікуваний вивід: Гав!
    }
}