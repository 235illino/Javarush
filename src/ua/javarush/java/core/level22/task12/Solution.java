package ua.javarush.java.core.level22.task12;

import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        // Створюємо два товари з однаковою назвою та різною ціною
        Product p1 = new Product("Кружка", 199.99);
        Product p2 = new Product("Кружка", 149.49);

        // Перевіряємо еквівалентність за equals (очікуємо true)
        System.out.println(p1.equals(p2));

        // Перевіряємо збіг хеш-кодів (очікуємо true)
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}