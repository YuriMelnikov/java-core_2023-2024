package lab7.example7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос имени файла у пользователя
        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();

        // Запрос текста для записи в файл
        System.out.println("Введите текст для записи в файл: ");
        String text = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
            System.out.println("Текст записан в файл: " + fileName);
            System.out.println("Количество записанных символов: " + text.length());
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}