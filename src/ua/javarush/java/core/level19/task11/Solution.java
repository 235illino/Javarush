package ua.javarush.java.core.level19.task11;

public class Solution {
    public static void main(String[] args) {
        // Створюємо менеджера "Ivan" із зарплатою 50000
        Manager manager = new Manager("Ivan", 50000);

        // Спочатку виводимо ім’я, потім зарплату
        System.out.println(manager.getName());
        System.out.println(manager.getSalary());
    }
}