package ua.javarush.java.core.level17.task16;

public class Solution {
    public static void main(String[] args) {
        // Створюємо кішку і задаємо їй ім’я
        Cat cat = new Cat();
        cat.animalName = "Мурка";

        // Демонструємо всі здібності: перевизначений eat, унікальні feedMilk і purr
        cat.eat();
        cat.feedMilk();
        cat.purr();
    }
}