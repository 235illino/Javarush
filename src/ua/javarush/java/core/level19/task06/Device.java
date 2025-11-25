package ua.javarush.java.core.level19.task06;

public abstract class Device {
    public abstract void turnOn();
    public void turnOff(){
        System.out.println("Пристрій вимкнено");
    }
}
