package ua.javarush.java.core.level23.task19;

public class Solution {
    // Константа податкової ставки. Так зрозуміліше й безпечніше, ніж "магічне число" 0.13 у коді.
    static final double INCOME_TAX_RATE = 0.13;

    public static void main(String[] args) {
        double employeeSalary = 5000;
        double calculatedTax = employeeSalary * INCOME_TAX_RATE;
        System.out.println(calculatedTax);
    }
}