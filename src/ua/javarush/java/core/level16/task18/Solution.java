package ua.javarush.java.core.level16.task18;

// Клас «розумної» коробки з узагальненим типом T
// Такий клас гарантує типобезпечність на етапі компіляції

    // Приватне поле для зберігання вмісту коробки


    // Розміщуємо предмет у коробці


    // Витягаємо вміст коробки


public class Solution {
    public static void main(String[] args) {
        // Створюємо коробку, яка може зберігати лише цілі числа (Integer)
        SmartBox<Integer> intBox = new SmartBox<>();

        // Поміщаємо число 42 (автобоксинг int -> Integer)
        intBox.store(42);

        // Витягаємо вміст і виводимо на екран
        Integer value = intBox.getContents();
        System.out.println(value);
    }
}