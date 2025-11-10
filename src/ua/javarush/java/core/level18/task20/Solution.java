package ua.javarush.java.core.level18.task20;

public class Solution {
    public static void main(String[] args) {
        // Створюємо масив типу Animal і наповнюємо його різними тваринами
        Animal[] animals = new Animal[2];
        animals[0] = new Cat("Мурка");
        animals[1] = new Cow("Буренка");

        // Поліморфний виклик: у кожної тварини викликається її реалізація makeSound()
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}