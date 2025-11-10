package ua.javarush.java.core.level19.task20;

public class WorkTask extends Task{
    private String deadline;
    public WorkTask(String title, String deadline) {
        super(title);
        this.deadline = deadline;
    }

    @Override
    public void complete() {
        System.out.println("Робоче завдання «" + getTitle() + "» виконано до дедлайну " + deadline);
    }
}
