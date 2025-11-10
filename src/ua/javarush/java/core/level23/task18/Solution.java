package ua.javarush.java.core.level23.task18;

public class Solution {
    // Осмислені імена полів
    private int value = 10;
    private String message = "Привіт";



    // Перейменований метод: чітко вказує, що виводить повідомлення


    public static void main(String[] args) {
        // Створюємо об’єкт і викликаємо метод для демонстрації результату
        Solution app = new Solution();
        app.printMessage();
    }

    private void printMessage() {
        System.out.println(message + " " + value);
    }
}