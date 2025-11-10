package ua.javarush.java.core.level17.task02;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт собаки
        Dog dog = new Dog();

        // Присвоюємо ім’я улюбленцю
        dog.petName = "Шарик";

        // Демонструємо успадковану поведінку сну
        dog.sleep();

        // Демонструємо унікальну поведінку собаки — лай
        dog.bark();
    }
}