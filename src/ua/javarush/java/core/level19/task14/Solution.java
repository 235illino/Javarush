package ua.javarush.java.core.level19.task14;

public class Solution {
    public static void main(String[] args) {
        // Створюємо два повідомлення з текстом "Привіт!"
        Message email = new EmailMessage("Привіт!");
        Message sms = new SmsMessage("Привіт!");

        // Надсилаємо кожне повідомлення — будуть викликані їх перевизначені методи send()
        email.send();
        sms.send();
    }
}