package ua.javarush.java.core.level20.task18;

public class Notification {
    private MessageSender messageSender;

    public Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notifyUser(String text) {
        messageSender.send(text);
    }
}
