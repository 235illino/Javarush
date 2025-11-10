package ua.javarush.java.core.level22.task14;

import javax.naming.InvalidNameException;

public record Email(String address) {
    public Email {
        if (address == null || address.isEmpty() || !address.contains("@"))
            throw new IllegalArgumentException("Email is invalid");
    }
}
