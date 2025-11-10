package ua.javarush.java.core.level23.task16;

public class Programmer extends Worker implements Reportable{
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void report() {
        System.out.println("Програміст здає звіт");

    }

    @Override
    void work() {
        System.out.println("Програміст пише код");
    }
}
