package ua.javarush.java.core.level21.task12;

// Демонстрація розв’язання конфлікту default-методів під час множинної реалізації інтерфейсів.
public class Solution {
    public static void main(String[] args) {
        C c = new C();
        c.show(); // Має вивести: A (з нового рядка) потім B
    }
}