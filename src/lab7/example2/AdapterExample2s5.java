package lab7.example2;

import java.io.*;
import java.util.Scanner;

public class AdapterExample2s5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String outputFileName = "src/lab7/example1/output5.txt";
        try (OutputStream outputStream = new FileOutputStream(outputFileName);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {

            System.out.println("Введите строки для записи в файл. Введите 'exit' для завершения.");

            String line;
            while (!(line = in.nextLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e){
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
