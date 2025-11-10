package ua.javarush.java.core.level20.task08;

public abstract class Appliance {
    public void turnOn(){
        System.out.println("Пристрій увімкнено");
    }
    public abstract void work();
}
