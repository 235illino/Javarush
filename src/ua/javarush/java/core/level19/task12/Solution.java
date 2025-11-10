package ua.javarush.java.core.level19.task12;

public class Solution {
    public static void main(String[] args) {
        // Створюємо масив базового типу Payment: можна зберігати будь-яких його нащадків
        Payment[] payments = new Payment[] {
                new CashPayment(),    // екземпляр оплати готівкою
                new OnlinePayment()   // екземпляр онлайн-оплати
        };

        // Поліморфний виклик: для кожного об’єкта буде викликано власну реалізацію process()
        for (Payment payment : payments) {
            payment.process();
        }
    }
}