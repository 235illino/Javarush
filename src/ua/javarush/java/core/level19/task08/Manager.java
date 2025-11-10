package ua.javarush.java.core.level19.task08;

public class Manager extends Employee {
    private double baseSalary;
    public Manager(String name, int baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary() {
        return this.baseSalary;
    }
}
