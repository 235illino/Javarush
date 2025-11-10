package ua.javarush.java.core.level15.task09;

// Клас Solution — точка входу програми
public class Solution {
    public static void main(String[] args) {
        // Створюємо товар із початковою назвою "Старий товар"
        Product product = new Product("Старий товар");

        // Перейменовуємо товар на "Новий товар" за допомогою сетера
        product.setProductName("Новий товар");

        // Виводимо оновлену назву за допомогою гетера
        System.out.println(product.getProductName());
    }
}

// Клас Product інкапсулює назву товару
class Product {

    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}