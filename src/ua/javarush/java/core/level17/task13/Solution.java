package ua.javarush.java.core.level17.task13;

public class Solution {
    public static void main(String[] args) {
        // Створюємо собаку — конкретний улюбленець, успадковує все від Animal
        Dog bobik = new Dog();

        // Задаємо ім’я улюбленця, присвоюючи значення полю petName
        bobik.petName = "Бобик";

        // Просимо улюбленця поїсти — метод успадкований від Animal
        bobik.eat();
    }
}