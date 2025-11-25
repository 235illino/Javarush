package ua.javarush.java.core.level15.task07.main;

public class ModuleMain {
    public static void main(String[] args) {
        // Класи в одному пакеті мають доступ до package-private методів
        ModuleHelper moduleHelper = new ModuleHelper();
        moduleHelper.provideInternalAssistance();

    }
}