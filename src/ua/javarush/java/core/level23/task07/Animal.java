package ua.javarush.java.core.level23.task07;

// Клас Animal відповідає за будь-яку тварину і гарантує, що вона завжди має ім’я
public class Animal {
    // Поле для зберігання імені тварини
    private final String name;

    // Конструктор, що приймає ім’я тварини
    // У класі немає конструктора без параметрів, щоб не можна було створити тварину без імені
    public Animal(String petName) {
        this.name = petName;
    }

    // Геттер для отримання імені тварини
    public String getName() {
        return name;
    }
}