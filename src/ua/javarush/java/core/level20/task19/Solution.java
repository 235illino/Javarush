package ua.javarush.java.core.level20.task19;

// Демонстрація патерна "Стратегія": перемикаємо стиль вітання на льоту.
public class Solution {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        // Спочатку використовуємо дружню стратегію
        greeter.setStrategy(new FriendlyGreeting());
        greeter.greet("Вася");

        // Потім перемикаємося на формальну стратегію
        greeter.setStrategy(new FormalGreeting());
        greeter.greet("Вася");
    }
}