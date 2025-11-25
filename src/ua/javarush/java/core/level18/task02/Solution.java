package ua.javarush.java.core.level18.task02;

public class Solution {
    public static void main(String[] args) {
        // Масив типу Animal зберігає посилання на різні конкретні тварини.
        Animal[] pen = { new Cat(), new Cow() };

        // Поліморфізм: викликається версія makeSound() конкретного об’єкта,
        // навіть якщо змінна має тип базового класу Animal.
        for (Animal animal : pen) {
            animal.makeSound(); // Очікуваний вивід: "Мяу!" потім "Мууу!"
        }
    }
}