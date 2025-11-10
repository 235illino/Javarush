package ua.javarush.java.core.level22.task19;

public record Document(String s) implements Printable {
    @Override
    public void print() {
        System.out.println("Документ: " + s);
    }
}
