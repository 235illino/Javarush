package ua.javarush.java.core.level23.task09;

public class Solution {
    public static void main(String[] args) {
        // Створюємо новий автомобіль і заповнюємо його дані
        Car newCar = new Car(); // об’єкт нашої "картотеки"
        newCar.carBrand = "Toyota";       // марка автомобіля
        newCar.productionYear = 2022;     // рік випуску

        // Виводимо інформацію, щоб упевнитися, що дані внесено
        System.out.println("Марка: " + newCar.carBrand);
        System.out.println("Рік випуску: " + newCar.productionYear);
    }
}