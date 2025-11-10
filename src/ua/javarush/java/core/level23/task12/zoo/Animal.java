package ua.javarush.java.core.level23.task12.zoo;

public class Animal {
    // Захищений метод: доступний усередині класу, його нащадкам і класам у тому самому пакеті
    protected void makeSound() {
        System.out.println("Some sound");
    }
}