package ua.javarush.java.core.level17.task08;

public class Solution {
    public static void main(String[] args) {
        // Створюємо спеціалізований кошик для яблук
        AppleBasket appleBasket = new AppleBasket();

        // Коваріантність: метод AppleBasket.getFruit() повертає Apple,
        // але ми можемо зберегти результат у змінну типу Fruit
        Fruit harvestedItem = appleBasket.getFruit();

        // Перевіряємо, чи справді з кошика прийшло яблуко
        if (harvestedItem instanceof Apple) {
            System.out.println("Apple created");
        }
    }
}