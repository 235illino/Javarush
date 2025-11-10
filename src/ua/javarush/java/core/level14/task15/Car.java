package ua.javarush.java.core.level14.task15;

public class Car {
    public String carBrand;
    public String carModel;
    public int productionYear;

    public Car(String carBrand, String carModel, int productionYear) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.productionYear = productionYear;
    }

    public Car(String carBrand, String carModel) {
        this(carBrand, carModel, 2024);
    }

    public Car() {
        this("Unknown", "Unknown");
    }
}
