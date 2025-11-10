package ua.javarush.java.core.level19.task18;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Створюємо сховище та сервіс, який спирається лише на абстракцію TaskRepository
        TaskRepository repository = new InMemoryTaskRepository();
        TaskService service = new TaskService(repository);

        // Демонстрація: створюємо нову задачу
        Task task = new Task("Написати демо для TaskService");

        // Додаємо задачу через сервіс (делегування до репозиторію)
        service.addTask(task);

        // Дивимося стан до виконання
        System.out.println("До виконання:  " + task);

        // Виконуємо задачу за назвою через сервіс
        service.completeTask("Написати демо для TaskService");

        // Дивимося стан після виконання
        System.out.println("Після виконання: " + task);
    }
}