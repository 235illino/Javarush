package ua.javarush.java.core.level15.task12;

public class SchoolStudent {
    private int currentAge;

    public SchoolStudent(int currentAge) {
        this.currentAge = currentAge;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int potentialAge) {
        if(potentialAge < 0) System.out.println("Увага! Вік студента не може бути від’ємним. Значення не оновлено.");
        else this.currentAge = potentialAge;
    }
}
