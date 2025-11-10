package ua.javarush.java.core.level18.task15;

// Демонстрація поліморфізму: додали новий тип співробітника Tester,
// і система без змін логіки main коректно викликає його роботу.
public class Solution {
    public static void main(String[] args) {
        // Створюємо масив посилань базового типу Employee
        Employee[] team = {
                new Manager(),
                new Developer(),
                new Tester() // новий тип співробітника
        };

        // Поліморфний виклик: у кожного елемента масиву викликається свій варіант work()
        for (Employee e : team) {
            e.work();
        }
    }
}