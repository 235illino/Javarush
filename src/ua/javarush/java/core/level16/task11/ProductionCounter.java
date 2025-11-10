package ua.javarush.java.core.level16.task11;

public class ProductionCounter {

    // Публічний метод, у якому створюємо анонімний клас Runnable і викликаємо його run()
    public void startCountOperation() {
        // Створюємо об’єкт інтерфейсу Runnable за допомогою анонімного класу
        new Runnable(){
            @Override
            public void run() {
                System.out.println("Лічильник запущено");
            }
        }.run();

        // Викликаємо метод run() прямо всередині startCountOperation()

    }

    public static void main(String[] args) {
        // Створюємо об’єкт ProductionCounter і запускаємо операцію підрахунку
        ProductionCounter counter = new ProductionCounter();
        counter.startCountOperation();
    }
}