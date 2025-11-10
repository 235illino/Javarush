package ua.javarush.java.core.level16.task10;

// Оголошуємо інтерфейс Communicator з єдиним методом greet
interface Communicator {
    void greet();
}

public class Solution {
    public static void main(String[] args) {
        // Створюємо об'єкт анонімного класу, що реалізує Communicator
        new Communicator(){
            @Override
            public void greet() {
                System.out.println("Привіт, світе!");
            }
        }.greet();

        // Викликаємо метод greet(), щоб вивести привітання на екран

    }
}