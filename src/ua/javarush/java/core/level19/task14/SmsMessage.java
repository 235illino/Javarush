package ua.javarush.java.core.level19.task14;

public class SmsMessage extends Message{
    public SmsMessage(String text) {
        super(text);
    }

    @Override
    public void send() {
        System.out.println("Надсилання SMS: " + super.getText());
    }
}
