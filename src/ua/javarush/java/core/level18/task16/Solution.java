package ua.javarush.java.core.level18.task16;

public class Solution {
    public static void main(String[] args) {
        // Створюємо масив базового типу Employee на 5 елементів.
        // Залишаємо один вільний слот під майбутнього співробітника (стажера),
        // щоб додати його в той самий масив без повторного створення.
        Employee[] staff = new Employee[5];

        // Поточний штат: базовий співробітник і три нащадки.
        staff[0] = new Employee();
        staff[1] = new Manager();
        staff[2] = new Developer();
        staff[3] = new Designer();

        // Один і той самий цикл (усередині методу) викликає work() у кожного співробітника.
        printWorkForAll(staff);

        // Компанія наймає стажера: додаємо його в той самий масив.
        staff[4] = new Intern();

        // Той самий цикл без змін коректно обробляє новий тип співробітника.
        printWorkForAll(staff);
    }

    // Універсальна логіка обходу масиву співробітників
    private static void printWorkForAll(Employee[] staff) {
        for (Employee e : staff) {
            if (e != null) {          // пропускаємо незаповнені комірки
                e.work();             // поліморфний виклик: обирається реалізація за фактичним типом об’єкта
            }
        }
    }
}