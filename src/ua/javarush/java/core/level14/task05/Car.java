package ua.javarush.java.core.level14.task05;

public class Car {
    private String carBrand;
    private int productionYear;

    public Car(String carBrand, int productionYear) {
        this.carBrand = carBrand;
        this.productionYear = productionYear;
    }

    public void displayDetails(){
        System.out.printf("Марка: %s, рік випуску: %d", carBrand, productionYear);
    }
}
