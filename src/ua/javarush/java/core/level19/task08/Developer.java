package ua.javarush.java.core.level19.task08;

public class Developer extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;

    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getSalary() {
        return this.hourlyRate * this.hoursWorked;
    }
}
