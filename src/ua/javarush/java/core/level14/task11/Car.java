package ua.javarush.java.core.level14.task11;

public class Car {
    private String carBrand;
    private int carYear;

    public Car(String carBrand, int carYear) {
        this.carBrand = carBrand;
        this.carYear = carYear;
    }

    @Override
    public String toString() {
        return String.format("Марка: %s, рік випуску: %d", carBrand, carYear);
    }
}
