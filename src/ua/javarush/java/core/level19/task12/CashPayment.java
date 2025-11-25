package ua.javarush.java.core.level19.task12;

public class CashPayment extends Payment{
    @Override
    public void process() {
        System.out.println("Оплата готівкою");
    }
}
