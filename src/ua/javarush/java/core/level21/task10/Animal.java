package ua.javarush.java.core.level21.task10;

public interface Animal {
    void voice();
    default void sleep(){
        System.out.println("Animal is sleeping");
    }
}
