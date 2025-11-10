package ua.javarush.java.core.level15.task19;

public class SystemComponent {
    static {
        System.out.println("Глобальна ініціалізація: Крок 1");
    }
    static {
        System.out.println("Глобальна ініціалізація: Крок 2");
    }
    {
        System.out.println("Ініціалізація компонента: Крок А");
    }
    {
        System.out.println("Ініціалізація компонента: Крок Б");
    }

    public SystemComponent() {
        System.out.println("Компонент повністю налаштований і готовий!");
    }
}
