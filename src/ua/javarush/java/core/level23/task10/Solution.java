package ua.javarush.java.core.level23.task10;

public class Solution {
    public static void main(String[] args) {
        // «Викладаємо» товар на полицю — створюємо об’єкт Product
        Product product = new Product();

        // Встановлюємо ціну товару через публічний сетер (прямого доступу до поля немає)
        product.setPrice(49.99);

        // Зчитуємо ціну через геттер і виводимо на екран — контрольований доступ до даних
        double currentPrice = product.getPrice();
        System.out.println(currentPrice);
    }
}