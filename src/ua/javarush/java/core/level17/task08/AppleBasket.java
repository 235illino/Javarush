package ua.javarush.java.core.level17.task08;

public class AppleBasket extends Basket{
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
