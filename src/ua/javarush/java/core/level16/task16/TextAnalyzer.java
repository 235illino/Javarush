package ua.javarush.java.core.level16.task16;

import java.util.Scanner;

public class TextAnalyzer {

    // Метод-обробник імені: всередині оголошуємо локальний клас і використовуємо його
    public void generateNameReport(String customerName) {
        // Локальний клас доступний лише всередині цього методу
        class NameStatistics{
            private String originalCustomerName;

            public NameStatistics(String customerName) {
                this.originalCustomerName = customerName;
            }

            void printUpperCaseName(){
                System.out.println(originalCustomerName.toUpperCase());
            }
            void printNameLength(){
                System.out.println(originalCustomerName.length());
            }

        }
        NameStatistics nameStatistics = new NameStatistics(customerName);
        nameStatistics.printUpperCaseName();
        nameStatistics.printNameLength();


        // Створюємо об’єкт локального класу та послідовно викликаємо методи звіту

    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();          // читаємо ім’я з консолі
        new TextAnalyzer().generateNameReport(name);
    }
}