package ua.javarush.java.core.level25.task02;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Няв!");
    }
}
