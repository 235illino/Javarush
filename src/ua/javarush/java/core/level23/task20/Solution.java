package ua.javarush.java.core.level23.task20;

public class Solution {
    public static void main(String[] args) {
        // Створюємо один продукт і перевіряємо роботу гетера
        Product banana = new Product("Банан");
        System.out.println(banana.getProductName());
    }
}