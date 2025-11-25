package ua.javarush.java.core.level19.task17;

public class SimpleTask extends Task{
    protected SimpleTask(String title) {
        super(title);
    }

    @Override
    public void complete() {
        System.out.println(String.format("Завдання '%s' виконано", this.getTitle()));
    }
}
