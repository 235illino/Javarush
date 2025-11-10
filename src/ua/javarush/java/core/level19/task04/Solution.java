package ua.javarush.java.core.level19.task04;

public class Solution {
    public static void main(String[] args) {
        // Створюємо платіж PayPal і послідовно викликаємо загальну та специфічну логіку
        PaypalPayment payment = new PaypalPayment();
        payment.printInfo();   // спочатку загальна інформація
        payment.process();     // потім специфічна обробка
    }
}