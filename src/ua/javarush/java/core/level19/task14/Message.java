package ua.javarush.java.core.level19.task14;

public abstract class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public abstract void send();
}
