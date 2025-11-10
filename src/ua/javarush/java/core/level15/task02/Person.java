package ua.javarush.java.core.level15.task02;

public class Person {
    private String memberName;
    private int memberAge;

    public Person(String memberName, int memberAge) {
        this.memberAge = memberAge;
        this.memberName = memberName;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }
}
