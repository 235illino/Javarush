package ua.javarush.java.core.level19.task17;

public abstract class Task {
    private String title;

    protected Task(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public abstract void complete();
}
