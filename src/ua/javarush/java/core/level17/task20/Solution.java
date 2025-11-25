package ua.javarush.java.core.level17.task20;

public class Solution {
    public static void main(String[] args) {
        // Поліморфізм: посилання типу Animal вказує на об’єкт фактичного типу Cat
        Animal mysteriousCreature = new Cat();

        // Виклик sleep() призведе до виклику Cat.makeSound() завдяки динамічному зв’язуванню
        mysteriousCreature.sleep();
    }
}