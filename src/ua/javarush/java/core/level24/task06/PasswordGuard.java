package ua.javarush.java.core.level24.task06;

public class PasswordGuard {
    public void enforcePasswordStrength(String password) throws WeakPasswordException {
        if(password.length() < 6){
            throw new WeakPasswordException("Пароль занадто короткий!");
        }
    }
}
