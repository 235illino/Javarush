package ua.javarush.java.core.level24.task12;

public class Solution {
    // Ініціює перший збій без першопричини (cause == null)
    public static void initiateSystemFailure() throws FirstSystemFailure {
        throw new FirstSystemFailure("Проблема в ядрі системи", null);
    }

    // Викликає initiateSystemFailure і, у разі збою, обгортає його у другий рівень
    public static void triggerNavigationMalfunction() throws SecondSystemFailure {
        try {
            initiateSystemFailure();
        } catch (FirstSystemFailure e) {
            throw new SecondSystemFailure("Навігаційна система відмовила", e);
        }

    }

    // Викликає triggerNavigationMalfunction і, у разі збою, обгортає його в третій рівень
    public static void provokeLifeSupportCrisis() throws ThirdSystemFailure {
        try {
            triggerNavigationMalfunction();
        } catch (SecondSystemFailure e) {
            throw new ThirdSystemFailure("Критична відмова системи життєзабезпечення", e);
        }
    }

    public static void main(String[] args) {
        try {
            // Запускаємо ланцюг збоїв
            provokeLifeSupportCrisis();
        } catch (ThirdSystemFailure e) {
            // Друкуємо повний стек-трейс із ланцюжком причин (chained exceptions)
            e.printStackTrace();
        }
    }
}