package ua.javarush.java.core.level14.task15;

// Клас Car — просте "креслення" автомобіля з трьома полями та перевантаженими конструкторами

public class Solution {
    public static void main(String[] args) {
        // 1) Збирання автомобіля із зазначенням усіх параметрів
        Car fullConfigured = new Car("Toyota", "Camry", 2022);
        printCar(fullConfigured);

        // 2) Збирання автомобіля з маркою і моделлю, рік автоматично стане 2024
        Car brandModelOnly = new Car("Tesla", "Model 3");
        printCar(brandModelOnly);

        // 3) Збирання автомобіля без параметрів: "Unknown", "Unknown", 2024
        Car defaults = new Car();
        printCar(defaults);
    }

    // Зручний метод для виведення значень усіх полів автомобіля
    private static void printCar(Car car) {
        System.out.println(car.carBrand + " " + car.carModel + " " + car.productionYear);
    }
}