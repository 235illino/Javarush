package ua.javarush.java.core.level16.task13;

public class Solution {
    public static void main(String[] args) {
        // Невелика демонстрація роботи дошки оголошень
        DisplayBoard board = new DisplayBoard();
        board.showTemporaryMessage();
    }
}

class DisplayBoard {

    // Метод, усередині якого оголошується локальний клас
    public void showTemporaryMessage() {
        // Локальний клас доступний лише в межах цього методу
        class GreetingDisplay{
            void displayMessage(){
                System.out.println("Привіт з локального класу!");
            }
        }
        new GreetingDisplay().displayMessage();
        // Створюємо об’єкт локального класу і викликаємо його метод

    }
}