package ua.javarush.java.core.level19.task16;

public class OfflineOrder extends Order{
    protected OfflineOrder(double amount) {
        super(amount);
    }

    @Override
    public void process() {
        System.out.println("Обробка офлайн-замовлення на суму " + this.getAmount());
    }
}
