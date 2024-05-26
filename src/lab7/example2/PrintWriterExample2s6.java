package lab7.example2;

import java.io.*;
import java.util.Scanner;

public class PrintWriterExample2s6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String outputFileName = "src/lab7/example1/output6.txt";
        try (PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8")) {
            System.out.println("Введите строки для записи в файл. Введите 'exit' для завершения.");

            String line;
            while (!(line = in.nextLine()).equalsIgnoreCase("exit")) {
                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
