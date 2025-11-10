package ua.javarush.java.core.level14.task10;

public class Dog {
    // Поля з основною інформацією про собаку
    private String dogName;
    private int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    @Override
    public String toString() {
        return String.format("Собаку звати %s, їй %d років", dogName, dogAge);
    }

    // Конструктор "реєстрації": одразу присвоюємо кличку та вік


    public static void main(String[] args) {
        // "Прибуття" нової собаки до притулку: задаємо кличку та вік через конструктор
        Dog dog = new Dog("Шарик", 5);
        System.out.println(dog);

        // Урочисте оголошення про прибуття

    }
}