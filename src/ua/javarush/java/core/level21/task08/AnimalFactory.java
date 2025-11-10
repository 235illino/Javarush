package ua.javarush.java.core.level21.task08;

public interface AnimalFactory<T> {
    T get(String name);
}
