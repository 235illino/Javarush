package ua.javarush.java.core.level19.task16;

// Демонстрація абстракції та поліморфізму на прикладі обробки замовлень
public class Solution {
    public static void main(String[] args) {
        // Створюємо масив базового типу Order — він може зберігати об’єкти будь-яких підкласів
        Order[] orders = {
                new OnlineOrder(100.0),
                new OfflineOrder(50.0),
                new OnlineOrder(299.99),
                new OfflineOrder(75.5)
        };

        // Поліморфізм: для кожного замовлення викликається його варіант методу process()
        for (Order order : orders) {
            order.process();
        }
    }
}