package ua.javarush.java.core.level15.task20;

public class UserProfile {
    private String userIdentifier;
    {
        userIdentifier = "DEFAULT_REG_ID";
        System.out.println("Тимчасовий ID користувача присвоєно.");
    }

    public UserProfile() {
        System.out.println("Створено профіль без імені.");
    }

    public UserProfile(String initialName) {
        this.userIdentifier = initialName;
        System.out.println("Створено профіль з іменем: " + initialName);
    }
}
