package ua.javarush.java.core.level20.task18;

public class Solution {
    public static void main(String[] args) {
        // Впроваджуємо реалізацію EmailSender у Notification
        MessageSender emailSender = new EmailSender();
        Notification notification = new Notification(emailSender);

        // Тестуємо надсилання сповіщення
        notification.notifyUser("Привіт!"); // Очікуваний вивід: "Email надіслано: Привіт!"
    }
}