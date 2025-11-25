package ua.javarush.java.core.level19.task19;

public class UserInterface {
    TaskService taskService;

    public UserInterface(TaskService taskService) {
        this.taskService = taskService;
    }
    public void addAndCompleteTask(String title){
        Task task = new Task(title);
        taskService.addTask(task);
        taskService.completeTask(title);
        //task.complete();
    }
}
