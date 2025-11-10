package ua.javarush.java.core.level19.task19;

import java.util.HashMap;
import java.util.Map;

/**
 * Демонстрація багатошарової архітектури з впровадженням залежностей через конструктори.
 * Шари: UserInterface -> TaskService -> TaskRepository (реалізація InMemoryTaskRepository).
 */
public class Solution {
    public static void main(String[] args) {
        // Створюємо реалізацію репозиторію (сховище в пам’яті)
        TaskRepository repository = new InMemoryTaskRepository(); // Можна легко замінити на іншу реалізацію

        // Впроваджуємо репозиторій у сервіс (через конструктор)
        TaskService service = new TaskService(repository);

        // Впроваджуємо сервіс у користувацький інтерфейс (через конструктор)
        UserInterface ui = new UserInterface(service);

        // Демонстрація роботи: додаємо і відразу позначаємо завдання виконаним
        ui.addAndCompleteTask("Вивчити впровадження залежностей через конструктор");
    }
}