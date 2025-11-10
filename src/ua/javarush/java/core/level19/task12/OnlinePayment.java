package ua.javarush.java.core.level19.task12;

public class OnlinePayment extends Payment{
    @Override
    public void process() {
        System.out.println("Онлайн-оплата");
    }
}
