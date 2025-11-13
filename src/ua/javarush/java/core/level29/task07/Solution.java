package ua.javarush.java.core.level29.task07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Створюємо динамічний список для зберігання учасників
        List<Person> attendees = new ArrayList<>();

        // Заповнюємо список об’єктами Person з різного віку
        attendees.add(new Person("Іван", 21));
        attendees.add(new Person("Анна", 19));
        attendees.add(new Person("Сергій", 30));
        attendees.add(new Person("Марія", 25));
        attendees.add(new Person("Дмитро", 22));

        attendees.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.personAge, o2.personAge);
            }
        });
        // Сортуємо список за віком (у порядку зростання) за допомогою анонімного класу Comparator

        

        // Виводимо результат: "Ім’я, вік" у кожному рядку
        for (Person p : attendees) {
            System.out.println(p.personName + ", " + p.personAge);
        }
    }
}

// Простий клас Person із потрібними полями.
class Person {
    public final String personName;
    public final int personAge;

    public Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }
}