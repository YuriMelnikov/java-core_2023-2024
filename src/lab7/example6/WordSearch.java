package lab7.example6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос имени файла у пользователя
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        // Запрос слова для поиска у пользователя
        System.out.print("Введите слово для поиска: ");
        String searchWord = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
