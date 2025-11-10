package ua.javarush.java.core.level20.task08;

public class SmartPhone extends Appliance implements Chargeable{
    @Override
    public void work() {
        System.out.println("Смартфон працює");
    }

    @Override
    public void charge() {
        System.out.println("Смартфон заряджається");
    }
}
