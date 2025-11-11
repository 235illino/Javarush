package ua.javarush.java.core.level25.task10;

// Базовий клас для запуску прикладу
public class Solution {
    public static void main(String[] args) {
        UserAccessService service = new UserAccessService();

        try {
            // Імітація невдалої спроби входу: неправильний пароль
            service.authenticateUser("agent007", "wrong");

            // Якщо винятку не було — доступ дозволено
            System.out.println("Доступ дозволено.");
        } catch (SecurityBreachException e) {
            // Перехоплюємо за базовим типом — демонстрація поліморфізму
            System.out.println("Відбувся збій безпеки: " + e.getMessage());
        }
    }
}

// Спільний базовий клас для всіх винятків безпеки
class SecurityBreachException extends Exception {
    public SecurityBreachException() {
    }

    public SecurityBreachException(String message) {
        super(message);
    }

    public SecurityBreachException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Спеціалізований виняток для невдалої аутентифікації
// Успадковується від загального винятку безпеки
class AuthenticationFailedException extends SecurityBreachException {
    public AuthenticationFailedException() {
    }

    public AuthenticationFailedException(String message) {
        super(message);
    }

    public AuthenticationFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Клас, що відповідає за аутентифікацію користувачів
class UserAccessService {
    // «Сховище» коректних облікових даних (для простоти — константи)
    private final String validUsername = "agent007";
    private final String validPassword = "secret";

    // Перевантаження без параметрів — на випадок, якщо потрібна проста імітація спроби входу
    public void authenticateUser() throws AuthenticationFailedException {
        authenticateUser("guest", "1234"); // гарантовано не збігатиметься й згенерує виняток
    }

    // Метод аутентифікації: у разі невдачі викидає AuthenticationFailedException
    public void authenticateUser(String username, String password) throws AuthenticationFailedException {
        // Перевіряємо збіг логіна й пароля
        if (!validUsername.equals(username) || !validPassword.equals(password)) {
            // У реальному застосунку тут могли б бути логи, лічильники спроб тощо.
            throw new AuthenticationFailedException("невдала спроба входу для користувача '" + username + "'");
        }
        // Успішна аутентифікація — нічого не викидаємо
    }
}