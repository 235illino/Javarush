package ua.javarush.java.core.level16.task09;

public class Solution {
    public static void main(String[] args) {
        // Створюємо обʼєкт MagicalCreature за допомогою анонімного класу
        new MagicalCreature(){
            @Override
            void makeSound() {
                System.out.println("Ква-ква!");
            }
        }.makeSound();


        // Викликаємо метод, щоб почути унікальний звук

    }
}

// Базовий клас із загальною поведінкою
class MagicalCreature {
    void makeSound() {
        // Загальний звук для будь-яких магічних створінь
        System.out.println("Створіння видає звук");
    }
}