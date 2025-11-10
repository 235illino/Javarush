package ua.javarush.java.core.level14.task17;

public class Solution {
    public static void main(String[] args) {
        // «Народжуємо» тварину без явної ініціалізації полів
        Animal wildAnimal = new Animal();

        // Виводимо значення полів: для int за замовчуванням 0, для String — null
        System.out.println(wildAnimal.animalAge);
        System.out.println(wildAnimal.animalName);
    }
}

// Простий шаблон тварини: поля не ініціалізуються вручну