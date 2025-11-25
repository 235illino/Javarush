package ua.javarush.java.core.level15.task03;

public class Person {
    private String memberName;
    private int memberAge;

    public Person(String memberName, int memberAge) {
        this.memberName = memberName;
        this.memberAge = memberAge;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberName(String newName) {
        this.memberName = newName;
    }

    public void setMemberAge(int newAge) {
        if(newAge < 0) System.out.println("Помилка: вік не може бути від’ємним. Значення не змінено.");
        else this.memberAge = newAge;
    }
}
