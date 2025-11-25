package ua.javarush.java.core.level18.task13;

public class Solution {
    public static void main(String[] args) {
        // Використовуємо поліморфізм: посилання типу Animal на об’єкти Dog і Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Спочатку "голос" собаки, потім "голос" кішки
        dog.makeSound();
        cat.makeSound();
    }
}