package ua.javarush.java.core.level18.task19;

public class Solution {
    public static void main(String[] args) {
        // Масив посилань базового типу — зберігає різнорідних співробітників
        Employee[] team = new Employee[2];

        // Додаємо по одному обʼєкту кожного типу
        team[0] = new Manager();
        team[1] = new Developer();

        // Поліморфізм: один і той самий виклик work() поводиться по-різному
        // залежно від реального типу обʼєкта
        for (Employee employee : team) {
            employee.work();
        }
    }
}