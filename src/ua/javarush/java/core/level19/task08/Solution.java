package ua.javarush.java.core.level19.task08;

public class Solution {
    public static void main(String[] args) {
        // Масив базового типу Employee може зберігати різні підкласи — це поліморфізм
        Employee[] staff = new Employee[2];

        // Додаємо тестових співробітників
        staff[0] = new Manager("Анна", 100000);
        staff[1] = new Developer("Іван", 500, 160);

        // Проходимося масивом і виводимо ім’я та зарплату кожного співробітника
        for (Employee e : staff) {
            System.out.println("Ім’я: " + e.getName() + ", зарплата: " + e.getSalary());
        }
    }
}