package ua.javarush.java.core.level23.task12.zoo;

// Нащадок Animal
public class Dog extends Animal {

    public Dog() {
        // У нащадка доступ до protected-методу дозволений — виклик спрацює
        makeSound();
    }

    public void testCall() {
        // Можна викликати protected-метод і з інших методів нащадка
        this.makeSound();
    }
}