package ua.javarush.java.core.level15.task17;

public class ApplicationModule {
    public static String moduleStatusMessage;

    static {
        moduleStatusMessage = "Застосунок: Головний модуль готовий до роботи!";
        System.out.println(moduleStatusMessage);
    }
}
