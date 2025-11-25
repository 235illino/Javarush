package ua.javarush.java.core.level18.task14;

public class Solution {
    public static void main(String[] args) {
        // Створюємо масив, здатний зберігати об’єкти типу Employee
        Employee[] team = new Employee[2];

        // Додаємо до масиву по одному об’єкту Manager і Developer
        team[0] = new Manager();
        team[1] = new Developer();

        // Поліморфний виклик: метод work() викликається у посилання типу Employee,
        // але виконується перевизначена версія відповідного класу
        for (Employee employee : team) {
            employee.work();
        }
    }
}