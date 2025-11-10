package ua.javarush.java.core.level16.task02;

public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт Person з ім’ям "Anna"
        Person person = new Person("Anna");

        // Створюємо об’єкт внутрішнього класу Greeting через об’єкт зовнішнього класу
        // Синтаксис person.new Greeting() обов’язковий для non-static inner класів
        Person.Greeting greeting = person.new Greeting();

        // Викликаємо метод, який виводить привітання
        greeting.sayHello();
    }
}