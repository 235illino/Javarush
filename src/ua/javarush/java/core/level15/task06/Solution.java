package ua.javarush.java.core.level15.task06;

public class Solution {
    public static void main(String[] args) {
        MagicCalculator calculator = new MagicCalculator();

        // Викликаємо публічний метод додавання і зберігаємо результат
        int sum = calculator.addNumbers(10, 15);

        // Виводимо суму на екран
        System.out.println(sum);

        // Спроба викликати приватний метод ззовні класу спричинить помилку компіляції.
        //calculator.displayInternalResult(sum); // Помилка: displayInternalResult(int) has private access in MagicCalculator
    }
}