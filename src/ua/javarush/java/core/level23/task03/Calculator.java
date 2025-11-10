package ua.javarush.java.core.level23.task03;

public class Calculator {
    // Простий калькулятор: зберігаємо останній результат
    private int lastResult;

    // Публічний метод calculate() — точка виконання обчислень
    public void calculate() {
        int a = 10;
        int b = 5;

        // Приклад обчислень
        lastResult = a * b + (a - b);
//        public void printResult() {
//        }

        // код не скомпілюється, оскільки методи оголошуються лише всередині класу.


        printResult(lastResult); // винесемо друк результату в окремий метод рівня класу
    }

    private void printResult(int lastResult) {
        System.out.println(lastResult);
    }


    // Метод оголошено на рівні класу (як і має бути), а не всередині calculate()


    // Невелика демонстрація роботи
    public static void main(String[] args) {
        new Calculator().calculate();
    }
}