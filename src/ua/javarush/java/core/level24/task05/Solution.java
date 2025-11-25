package ua.javarush.java.core.level24.task05;

public class Solution {
    public static void main(String[] args) {
        // Невелика демонстрація роботи "стража воріт"

        try {
            // Пробуємо занадто малий рахунок — очікуємо виняток
            checkPlayerScore(5);
            System.out.println("Цей текст не буде виведено");
        } catch (ScoreTooLowException e) {
            System.out.println(e.getMessage()); // Виведе: "Рахунок гравця занадто низький!"
        }

        try {
            // Пробуємо коректний рахунок — винятків бути не повинно
            checkPlayerScore(12);
            System.out.println("Рахунок 12 прийнято");
        } catch (ScoreTooLowException e) {
            System.out.println(e.getMessage());
        }
    }

    // Метод-страж: перевіряє рахунок і кидає власний виняток за некоректного значення
    public static void checkPlayerScore(int score) throws ScoreTooLowException {
            if(score < 10) throw new ScoreTooLowException("Рахунок гравця занадто низький!");
            // Повідомлення має бути строго таким, як у вимогах

        // Якщо рахунок 10 або більше — метод завершується без винятків
    }
}