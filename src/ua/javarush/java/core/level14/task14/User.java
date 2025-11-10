package ua.javarush.java.core.level14.task14;

public class User {
    private String userName;
    private int userAge;

    public User() {
        this.userName = "Unknown";
        this.userAge = 0;
    }

    public User(String userName) {
        this.userName = userName;
        this.userAge = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
