package ua.javarush.java.core.level21.task09;

public interface Counter {
    default void reset(){
        System.out.println("Counter reset");
    }
    void increment();
}
