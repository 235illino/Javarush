package ua.javarush.java.core.level14.task06;

public class Solution {
    public static void main(String[] args) {
        // «Зараховуємо» нового студента, одразу задаючи ім’я та оцінку в конструкторі
        Student student = new Student("Sam", 4);

        // Урочисто оголошуємо про його появу
        System.out.println(student);

    }
}

// Окремий клас Student з полями та конструктором