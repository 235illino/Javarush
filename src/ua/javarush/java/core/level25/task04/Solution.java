package ua.javarush.java.core.level25.task04;

// Інтерфейс з єдиним абстрактним методом
interface Pressable {
    void activateEngine();
}

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт інтерфейсу Pressable «на льоту» за допомогою анонімного класу
        Pressable pressable = new Pressable() {
            @Override
            public void activateEngine() {
                System.out.println("Двигуни запущено! Ми летимо до зірок!");
            }
        };
        pressable.activateEngine();

        // «Натискаємо» кнопку: викликаємо метод активації

    }
}