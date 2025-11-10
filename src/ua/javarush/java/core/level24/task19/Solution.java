package ua.javarush.java.core.level24.task19;

public class Solution {
    public static void main(String[] args) {

            // Передаємо завідомо некоректний рядок: містить літери і не може бути перетворений у int
        try {
            parseMeasurementValue("123abc");
        } catch (NumberFormatException e) {
            System.out.println("Помилка перетворення числа: введено некоректні дані");
        }

        // У цій задачі виконання сюди не дійде, але залишимо рядок для повноти прикладу


            // Перехоплюємо помилку перетворення і повідомляємо користувача зрозумілим текстом


    }

    //    Перетворює рядкове значення вимірювання на ціле число.
    /**
     * @throws NumberFormatException
     */
    public static int parseMeasurementValue(String measurement) {
        return Integer.parseInt(measurement);
        // Стандартний спосіб перетворити рядок у int; у разі некоректного формату кидає NumberFormatException

    }
}