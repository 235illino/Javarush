package ua.javarush.java.core.level29.task04;

import java.util.Comparator;
import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        // Створюємо двох учасників
        Person anna = new Person("Анна");
        Person boris = new Person("Борис");

        // Створюємо компаратор за ім’ям
        PersonByNameComparator comparator = new PersonByNameComparator();

        // Порівнюємо через Objects.compare, передаючи компаратор
        int result = Objects.compare(anna, boris, comparator);

        // Виводимо вердикт за результатом порівняння
        if (result < 0) {
            System.out.println("Анна йде раніше Бориса");
        } else if (result > 0) {
            System.out.println("Борис йде раніше Анни");
        } else {
            System.out.println("Імена збігаються");
        }
    }
}