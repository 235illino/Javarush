package ua.javarush.java.core.level29.task08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо динамічний список учасників
        List<Person> participants = new ArrayList<>();

        // Заповнюємо список об’єктами Person з іменами різної довжини
        participants.add(new Person("Єва"));
        participants.add(new Person("Анна"));
        participants.add(new Person("Олександр"));
        participants.add(new Person("Ілля"));
        participants.add(new Person("Максим"));

        participants.sort(Comparator.comparingInt(o -> o.getPersonName().length()));
        // Сортуємо за зростанням довжини personName за допомогою лямбда-виразу (Comparator)


        // Виводимо лише імена учасників, по одному в рядок
        for (Person p : participants) {
            System.out.println(p.getPersonName());
        }
    }
}

// Клас Person з полем personName і простим конструктором
class Person {
    private final String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }
}