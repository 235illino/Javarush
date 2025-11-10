package ua.javarush.java.core.level23.task04;

public class Solution {
    public static void main(String[] args) {
        // Створюємо товар, обов’язково вказуючи ім’я в конструкторі
        Product product = new Product("Молоко");

        // Виводимо ім’я товару на екран, підтверджуючи успішне створення
        System.out.println(product.getProductName());


        // Приклад неправильного використання:
        // Product product = new Product();

    }
}