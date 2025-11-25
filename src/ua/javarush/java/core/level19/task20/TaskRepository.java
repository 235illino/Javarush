package ua.javarush.java.core.level19.task20;


import java.util.List;

public interface TaskRepository {

    List<Task> getTasks();
    Task findByTitle(String title);

    void add(Task task);
}
