package ua.javarush.java.core.level16.task18;

public class SmartBox<T> {
    private T t;

    public void store(T item) {
        this.t = item;
    }

    public T getContents(){
        return t;
    }
}
