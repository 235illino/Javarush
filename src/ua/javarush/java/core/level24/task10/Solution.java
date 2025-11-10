package ua.javarush.java.core.level24.task10;

import java.io.IOException;

public class Solution {

    // Етап 1: імітація збою під час підготовки вихідних даних
    public static void prepareSourceData() throws IOException {
        throw new IOException("Вихідний файл не знайдено");
        // Спеціально "падаємо" з IOException з потрібним повідомленням

    }

    // Етап 2: завантаження/обробка сирих даних
    public static void processRawData() throws DataLoadingError {
        try {
            prepareSourceData();
        } catch (IOException e) {
            throw new DataLoadingError("Помилка завантаження даних", e);
        }

    }

    // Етап 3: генерація підсумкового звіту
    public static void generateFinalReport() throws DataLoadingError {

            processRawData();


    }

    public static void main(String[] args) {
        try {
            generateFinalReport();
        } catch (DataLoadingError e) {
            // Виводимо повідомлення нашого винятку
            System.out.println(e.getMessage());

            // І повідомлення першопричини (IOException)
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println(cause.getMessage());
            }
        }
    }
}

// Користувацький виняток для узагальненої помилки завантаження даних
class DataLoadingError extends Exception {
    public DataLoadingError(String message) {
        super(message);
    }

    public DataLoadingError(String message, Throwable cause) {
        super(message, cause);
    }
}