package ua.javarush.java.core.level19.task19;

public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public void addTask(Task task) {
        taskRepository.save(task);
    }
    public void completeTask(String title) {
        Task task = taskRepository.findByTitle(title);
        if (task != null) {
            task.complete();
        } else {
            System.out.println("Завдання не знайдено: " + title);
        }
    }
}
