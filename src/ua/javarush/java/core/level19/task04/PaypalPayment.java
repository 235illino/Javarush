package ua.javarush.java.core.level19.task04;

public class PaypalPayment extends Payment{
    @Override
    public void process() {
        System.out.println("Обробка платежу через PayPal");
    }
}
