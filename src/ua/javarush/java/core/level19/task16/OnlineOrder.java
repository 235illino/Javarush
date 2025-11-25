package ua.javarush.java.core.level19.task16;

public class OnlineOrder extends Order{
    protected OnlineOrder(double amount) {
        super(amount);
    }

    @Override
    public void process() {
        System.out.println("Обробка онлайн-замовлення на суму " + this.getAmount());
    }
}
