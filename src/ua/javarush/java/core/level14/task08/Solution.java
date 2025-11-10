package ua.javarush.java.core.level14.task08;

public class Solution {
    public static void main(String[] args) {
        // Відкриваємо рахунок із заданим початковим балансом
        BankAccount bankAccount1 = new BankAccount("Sam", 5);
        BankAccount bankAccount2 = new BankAccount("Bob");
        bankAccount2.deposit(500);
        bankAccount1.printInfo();
        bankAccount2.printInfo();


        // Відкриваємо рахунок лише з ім’ям (баланс буде встановлено у 0)


        // Поповнюємо другий рахунок на 500 одиниць


        // Виводимо інформацію про кожен рахунок

    }
}

// Клас банківського рахунку з власником і поточним балансом