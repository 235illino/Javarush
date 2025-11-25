package ua.javarush.java.core.level16.task17;

// Клас-демо з методом main
public class Solution {
    public static void main(String[] args) {
        // Створюємо універсальну коробку без знання типу вмісту
        StorageBox box = new StorageBox();

        // Кладемо всередину рядок
        box.put("Привіт із минулого!");

        // Витягаємо вміст (тип Object) і виводимо на екран
        Object content = box.retrieve();
        System.out.println(content);
    }
}

// Універсальна коробка: зберігає будь-який об’єкт без інформації про його тип
class StorageBox {
    // Приватне поле для зберігання вмісту
    private Object object;

    // Розміщення предмета в коробці
    public void put(Object item){
        this.object = item;
    }

    // Вилучення предмета з коробки
    public Object retrieve(){
        return object;
    }

}