package ua.javarush.java.core.level21.task14;

public interface Printer {
    static void printHello(Printer p){
        p.print("Hello, world!");
    }
    void print(String text);
}
