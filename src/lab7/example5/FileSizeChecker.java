package lab7.example5;

import java.io.File;
import java.util.Scanner;

public class FileSizeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос имени файла у пользователя
        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();

        // Создание объекта файла
        File file = new File(fileName);

        // Проверка существования файла
        if (!file.exists()) {
            System.out.println("Файл не существует.");
            return;
        }

        // Получение размера файла в байтах
        long fileSize = file.length();

        // Вывод размера файла на экран
        System.out.println("Размер файла " + fileName + " составляет " + fileSize + " байт(а).");

        scanner.close();
    }
}
