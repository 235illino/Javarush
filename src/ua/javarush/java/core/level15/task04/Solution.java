package ua.javarush.java.core.level15.task04;

public class Solution {
    public static void main(String[] args) {
        // Створюємо товар з ID 101 і назвою "Молоко"
        Product product = new Product(101, "Молоко");

        // Виводимо дані через гетери
        System.out.println(product.getProductID());
        System.out.println(product.getProductName());

//        // Спроби змінити поля безпосередньо або через сетери неможливі:
//        product.productID = 202;          // помилка компіляції: поле private
//        product.productName = "Кефір";    // помилка компіляції: поле private
//        product.setProductID(202);        // помилка компіляції: методу немає
//        product.setProductName("Кефір");  // помилка компіляції: методу немає
    }
}