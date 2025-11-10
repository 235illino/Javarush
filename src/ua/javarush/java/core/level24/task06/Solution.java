package ua.javarush.java.core.level24.task06;

// Головний клас із методом main
public class Solution {
    public static void main(String[] args) {
        try {
            new PasswordGuard().enforcePasswordStrength("qqqq");

        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Власний перевірюваний виняток, успадковується від Exception
class WeakPasswordException extends Exception {
    // Конструктор, що приймає повідомлення і передає його в суперклас
    public WeakPasswordException(String message) {
        super(message);
    }
}