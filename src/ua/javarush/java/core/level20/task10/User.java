package ua.javarush.java.core.level20.task10;

import java.io.Serializable;

public class User implements Nameable, Serializable {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
