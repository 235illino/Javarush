package ua.javarush.java.core.level23.task16;

public abstract class Worker {
    private String employeeName;

    protected Worker(String employeeName) {
        this.employeeName = employeeName;
    }

    abstract void work();
}
