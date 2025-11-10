package ua.javarush.java.core.level16.task12;

// Головний клас із методом main
public class Solution {
    public static void main(String[] args) {
        // Створюємо об’єкт лабораторії та запускаємо механізм розкриття секрету
        SecureLab lab = new SecureLab();
        lab.revealSecret();
    }
}

// Клас секретної лабораторії
class SecureLab {
    // Приватне поле із секретом
    private String classifiedSecret = "Секрет розкрито!";

    // Метод, який «розкриває» секрет через анонімний клас
    void revealSecret() {
        // Створюємо об’єкт інтерфейсу Runnable через анонімний клас
        var revealMechanism = new Runnable(){
            @Override
            public void run() {
                System.out.println(classifiedSecret);
            }
        };

        // Викликаємо метод run() прямо тут, без створення окремого потоку
        revealMechanism.run();
    }
}