package ua.javarush.java.core.level21.task11;

public interface Printer {
    void print(String message);
    default void printTwice(String message){
        print(message);
        print(message);
    }
}
