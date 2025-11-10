package ua.javarush.java.core.level19.task20;

public class HomeTask extends Task{
    private String location;

    protected HomeTask(String title, String location) {
        super(title);
        this.location = location;
    }

    @Override
    public void complete() {
        System.out.println("Завдання виконано у " + this.location);
    }
}
