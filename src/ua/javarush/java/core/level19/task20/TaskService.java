package ua.javarush.java.core.level19.task20;


public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public void addTask(Task task) {
        taskRepository.add(task);
    }
    public void completeTask(String title) {
        Task task = taskRepository.findByTitle(title);
        if (task != null) {
            task.complete();
        } else {
            System.out.println("Завдання не знайдено: " + title);
        }
    }

    public void printAllTasksInfo() {
        var tasks = taskRepository.getTasks();
        tasks.forEach(task -> System.out.println(task.getTitle()));
    }

    public void completeAllTasks() {
        var tasks = taskRepository.getTasks();
        tasks.forEach(Task::complete);
    }
}
