package ua.javarush.java.core.level19.task14;

public class EmailMessage extends Message {
    public EmailMessage(String text) {
        super(text);
    }

    @Override
    public void send() {
        System.out.println("Надсилання email: " + super.getText());
    }
}
