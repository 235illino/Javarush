package ua.javarush.java.core.level24.task11;

public class Solution {
    public static void main(String[] args) {
        try {
            // Симулюємо "зовнішню помилку" з конкретною причиною (ланцюжок винятків)
            throw new InputValidationException("Зовнішня помилка обробки введення", new IllegalArgumentException("Передано некоректний формат даних"));
            
        } catch (InputValidationException e) {
            // 1) повідомлення зовнішнього винятку
            System.out.println(e.getMessage());

            // 2) повідомлення винятку-джерела (кореня)
            System.out.println(e.getCause().getMessage());

            // 3) ім’я класу винятку-джерела
            System.out.println(e.getCause().getClass().getName());
        }
    }
}