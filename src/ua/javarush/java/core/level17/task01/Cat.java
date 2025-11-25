package ua.javarush.java.core.level17.task01;

public class Cat extends Animal{

    public void meow() {
        System.out.printf("%s каже: Няв!\n", super.petName);
    }
}
