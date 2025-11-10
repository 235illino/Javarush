package ua.javarush.java.core.level20.task04;

public class Solution {
    public static void main(String[] args) {
        // "Зоопарк" — масив, який зберігає об’єкти, що вміють видавати звук
        Soundable[] zoo = new Soundable[2];

        // Додаємо одного Dog і одного Cat
        zoo[0] = new Dog();
        zoo[1] = new Cat();

        // Просимо кожну тварину по черзі видати звук
        for (Soundable animal : zoo) {
            animal.makeSound();
        }
    }
}