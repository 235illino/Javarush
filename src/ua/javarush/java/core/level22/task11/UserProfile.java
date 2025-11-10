package ua.javarush.java.core.level22.task11;

public record UserProfile(String name, int age) {
    @Override
    public String toString() {
        return String.format("Користувач: %s (%d років)", name, age);
    }
}
