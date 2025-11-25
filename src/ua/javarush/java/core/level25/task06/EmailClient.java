package ua.javarush.java.core.level25.task06;

import ua.javarush.java.core.level18.task19.Employee;

public class EmailClient {

    // Нестатичний внутрішній клас: лист існує лише в контексті EmailClient
    public class Email{
        private String content;

        public Email(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }

    // Метод, який "складає" лист і повертає новий об’єкт Email
    public Email composeEmail(String messageContent) {
        return this.new Email(messageContent);
        // Створюємо лист, прив’язаний до поточного екземпляра EmailClient

    }

    public static void main(String[] args) {
        // Створюємо поштовий клієнт
        EmailClient emailClient = new EmailClient();
        var testMail = emailClient.composeEmail("test");
        System.out.println(testMail.getContent());


        // Складаємо тестовий лист через метод composeEmail


        // Перевіряємо, що лист створено: виводимо його вміст

    }
}