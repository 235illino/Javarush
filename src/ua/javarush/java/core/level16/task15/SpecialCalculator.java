package ua.javarush.java.core.level16.task15;

public class SpecialCalculator {

    // Метод, який миттєво виводить суму numA і numB на екран
    public void calculateAndDisplaySum(int numA, int numB) {
        // Локальний клас — тимчасовий «модуль» відображення результату.
        // Його оголошено всередині методу, і він має доступ до його параметрів (вони ефективно final).
        class SumResultPrinter{
            void printResult(){
                System.out.println(numA + numB);
            }
        }
        new SumResultPrinter().printResult();

        // Створюємо об’єкт локального класу й одразу ж виводимо результат

    }
}