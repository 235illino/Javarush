package ua.javarush.java.core.level19.task20;

public class Solution {
    public static void main(String[] args) {
        // Створюємо конкретну реалізацію репозиторію (інфраструктурний шар)
        TaskRepository repository = new InMemoryTaskRepository();

        // Додаємо завдання різних типів (мінімум по одному кожного виду)
        repository.add(new WorkTask("Підготувати звіт", "п’ятниця 18:00"));
        repository.add(new HomeTask("Помити посуд", "кухня"));

        // Сервіс працює лише з інтерфейсом репозиторію та абстрактним типом Task
        TaskService service = new TaskService(repository);

        // 1) Отримання та вивід інформації про завдання
        service.printAllTasksInfo();

        System.out.println(); // Порожній рядок для наочності виводу

        // 2) Демонстрація виконання завдань
        service.completeAllTasks();
    }
}