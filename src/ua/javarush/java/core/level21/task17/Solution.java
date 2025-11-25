package ua.javarush.java.core.level21.task17;

public class Solution {
    public static void main(String[] args) {
        // Створюємо два контейнери з різними значеннями
        NumberBox boxA = new NumberBox(10);
        NumberBox boxB = new NumberBox(5);

        // Порівнюємо їх: додатне число — boxA більше за boxB; від’ємне — менше; нуль — рівні
        int result = boxA.compareTo(boxB);

        // Виводимо результат порівняння на екран
        System.out.println(result);
    }
}