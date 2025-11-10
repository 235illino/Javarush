package ua.javarush.java.core.level17.task07;

public class Solution {
    public static void main(String[] args) {
        // Поліморфізм: змінна типу Parent посилається на об’єкт типу Child
        Parent person = new Child();

        // Динамічний поліморфізм: викликається версія методу з класу Child
        person.greet(); // Очікуваний вивід: "Hello from Child"
    }
}