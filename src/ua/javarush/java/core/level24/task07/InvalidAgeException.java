package ua.javarush.java.core.level24.task07;

public class InvalidAgeException extends Exception{
    public InvalidAgeException() {
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
