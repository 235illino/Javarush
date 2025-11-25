package ua.javarush.java.core.level23.task02;

// Простий клас "Книга" з одним полем і методом.
// Він потрібен, щоб тип Book був доступний у проєкті й компілювався.
public class Book {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    // Метод, який ми намагатимемося викликати на null-посиланні
    public String getTitle() {
        return title;
    }
}