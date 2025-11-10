package ua.javarush.java.core.level20.task07;

public class MultiFunctionDevice implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Друк...");
    }

    @Override
    public void scan() {
        System.out.println("Сканування...");
    }
}
