package ua.javarush.java.core.level22.task15;

public record Person(String name, int age) {
    public static final String SPECIES = "Homo sapiens";

    public String greeting() {
        return String.format("Привіт, мене звати %s, мені %d років. Я — %s", name, age, SPECIES);
    }
}
