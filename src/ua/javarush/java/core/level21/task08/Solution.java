package ua.javarush.java.core.level21.task08;

public class Solution {
    public static void main(String[] args) {
        // Ініціалізуй змінну фабрики посиланням на конструктор Animal
        // Це коротше й наочніше, ніж писати лямбда-вираз (name) -> new Animal(name)
        AnimalFactory<Animal> factory = Animal::new;


        // Створи улюбленця на ім’я "Барсик" через фабрику
        var dog = factory.get("Барсик");
        System.out.println(dog.getName());

        // Виведи ім’я улюбленця, щоб підтвердити успішне створення

    }
}