package ua.javarush.java.core.level22.task13;

public record Temperature(int celsius) {
    public static Temperature fromFahrenheit(int far) {
        return new Temperature((far - 32) * 5 / 9);
    }
}
