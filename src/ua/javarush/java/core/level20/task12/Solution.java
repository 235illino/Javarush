package ua.javarush.java.core.level20.task12;

public class Solution {
    // Універсальна процедура тестування: приймає будь-який Player і будь-який Recorder
    public static void testDevice(Player p, Recorder r) {
        // Виклики відповідних можливостей
        p.play();
        r.record();
    }

    public static void main(String[] args) {
        // Створюємо один пристрій
        MediaDevice device = new MediaDevice();

        // Передаємо один і той самий об’єкт одразу в обох ролях: і Player, і Recorder
        testDevice(device, device);
    }
}