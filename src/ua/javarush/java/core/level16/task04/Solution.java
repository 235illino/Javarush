package ua.javarush.java.core.level16.task04;

public class Solution {
    public static void main(String[] args) {
        // Створюємо будинок із загальною адресою
        House house = new House("Sunny Valley Lane");

        // Через об’єкт зовнішнього класу створюємо об’єкт внутрішнього класу.
        // Синтаксис house.new Room(...) обов’язковий для нестатичного внутрішнього класу.
        House.Room room = house.new Room("Master Bedroom");

        // Виводимо ідентифікатор кімнати та загальну адресу будинку
        room.printAddresses();
    }
}