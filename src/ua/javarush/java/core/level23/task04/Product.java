package ua.javarush.java.core.level23.task04;

// Публічний клас Product — модель товару
public class Product {
    // Приватне рядкове поле — ім’я товару недоступне напряму ззовні
    private String productName;

    // Конструктор, який обов’язково приймає ім’я товару
    public Product(String productName) {
        // Одразу зберігаємо передане ім’я в приватне поле
        this.productName = productName;
    }

    // Геттер для читання імені товару (саме поле лишається private)
    public String getProductName() {
        return productName;
    }

}