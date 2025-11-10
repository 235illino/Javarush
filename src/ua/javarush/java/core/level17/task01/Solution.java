package ua.javarush.java.core.level17.task01;

public class Solution {
    public static void main(String[] args) {
        // Створюємо кота і задаємо йому ім’я через поле petName
        Cat cat = new Cat();
        cat.petName = "Барсик";

        // Викликаємо дії кота у потрібному порядку
        cat.eat();
        cat.meow();
    }
}