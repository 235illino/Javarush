package ua.javarush.java.core.level24.task05;

// Власний (перевірюваний) виняток, що сигналізує про занадто низький рахунок гравця
public class ScoreTooLowException extends Exception {
    // Конструктор приймає повідомлення про помилку та передає його базовому класу Exception
    public ScoreTooLowException(String message) {
        super(message);
    }
}